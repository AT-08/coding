package org.fundacionjala.coding.jorge;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public final class BankOCR {

    private static final Map<String, String> PATTERN;
    static {
        Map<String, String> mapElem = new HashMap<>();
        mapElem.put("     |  |", "1");
        mapElem.put(" _  _||_ ", "2");
        mapElem.put(" _  _| _|", "3");
        mapElem.put("   |_|  |", "4");
        mapElem.put(" _ |_  _|", "5");
        mapElem.put(" _ |_ |_|", "6");
        mapElem.put(" _   |  |", "7");
        mapElem.put(" _ |_||_|", "8");
        mapElem.put(" _ |_| _|", "9");
        mapElem.put(" _ | ||_|", "0");
        PATTERN = Collections.unmodifiableMap(mapElem);
    }
    public static final int STEP = 3;
    public static final int MOD = 11;

    /**
     *
     */
    private BankOCR() {
    }

    /**
     *
     * @param s1 compenent 1.
     * @param s2 component 2.
     * @param s3 component 3.
     * @return number decoded.
     */
    public static String decode(final String s1, final String s2, final String s3) {
        String numPatter = "";
        String numResult = "";
        for (int column = 0; column < s1.length(); column += STEP) {
            String cad = numPatter.concat("")
                    .concat(s1.substring(column, column + STEP))
                    .concat(s2.substring(column, column + STEP))
                    .concat(s3.substring(column, column + STEP));
            numResult = numResult.concat(PATTERN.getOrDefault(cad, "?"));
        }
        return numResult;
    }

    /**
     *
     * @param numString number String.
     * @return right, ill or err to valid number.
     */
    public static String checks(final String numString) {
        if (numString.contains("?")) {
            return numString.concat(" ILL");
        }
        boolean isValidChecksum = checksum(numString);
        return isValidChecksum ? numString : numString.concat(" ERR");
    }

    /**
     *
     * @param patt String to evaluate.
     * @return boolean.
     */
    public static boolean checksum(final String patt) {
        int mult = patt.length();
        int checks = 0;
        for (String numS : patt.split("")) {
            checks += mult * Integer.parseInt(numS);
            --mult;
        }
        return checks % MOD == 0;
    }
}
