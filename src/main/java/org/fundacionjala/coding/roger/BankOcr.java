package org.fundacionjala.coding.roger;

import java.util.HashMap;
import java.util.Map;
/**
 * Kata BankOCR.
 *
 */
public class BankOcr {
    static final Map<String, String> NUMBERLIST = new HashMap<>();
    static {
        NUMBERLIST.put(" _ | ||_|", "0");
        NUMBERLIST.put("     |  |", "1");
        NUMBERLIST.put(" _  _||_ ", "2");
        NUMBERLIST.put(" _  _| _|", "3");
        NUMBERLIST.put("   |_|  |", "4");
        NUMBERLIST.put(" _ |_  _|", "5");
        NUMBERLIST.put(" _ |_ |_|", "6");
        NUMBERLIST.put(" _   |  |", "7");
        NUMBERLIST.put(" _ |_||_|", "8");
        NUMBERLIST.put(" _ |_| _|", "9");
    }
    /**
     *@param letter1 input String.
     *@param letter2 input String.
     *@param letter3 input String.
     *@return return number.
     */
    public String toNumber(final String letter1, final String letter2, final String letter3) {
        final int sep = 3;
        String[] line = {letter1, letter2, letter3};
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < line[0].length() / sep; i++) {
            String cad = line[0].substring(sep * i, sep + (sep * i))
                    .concat(line[1].substring(sep * i, sep + (sep * i)))
                            .concat(line[2].substring(sep * i, sep + (sep * i)));
            number.append(NUMBERLIST.getOrDefault(cad, "?"));
        }
        return number.toString();
    }
    /**
     *@param number input String.
     *@return return number verify.
     */
    public String verify(final String number) {
        if (number.contains("?")) {
            return number.concat(" ILL");
        }
        return checksum(number) ? number : number.concat(" ERR");
    }
    /**
     *@param number input String.
     *@return return boolean.
     *
     */
    public boolean checksum(final String number) {
        final int mod = 11;
        int prod = number.length();
        int checks = 0;
        for (String numString : number.split("")) {
            checks += prod * Integer.parseInt(numString);
            --prod;
        }
        return checks % mod == 0;
    }
}
