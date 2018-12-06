package org.fundacionjala.coding.abel;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class BankOCR {


    private static final Map<String, String> CONTAINER;
    public static final int CONT = 3;
    /**
     *
     */
    public static final int ONCE = 11;

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

        CONTAINER = Collections.unmodifiableMap(mapElem);
    }


    /**
     * @param string1 string input 1
     * @param string2 string input  2
     * @param string3 string input 3
     * @return value of return
     */
    public String scanner(final String string1, final String string2, final String string3) {
        StringBuilder newContainer = new StringBuilder();
        for (int column = 0; column < string1.length(); column += CONT) {
            String a = string1.substring(column, column + CONT)
                    .concat(string2.substring(column, column + CONT))
                    .concat(string3.substring(column, column + CONT));
            newContainer.append(CONTAINER.getOrDefault(a, "?"));


        }
        return newContainer.toString();
    }

    /**
     * @param string1 string input 1
     * @return value of return
     */
    public String checksum(final String string1) {
        if (string1.contains("?")) {
            return string1.concat(" ILL");
        }
        boolean state = isValide(string1);
        return state ? string1 : string1.concat(" ERR");

    }

    /**
     * @param stringInput String to evaluate.
     * @return boolean.
     */
    public static boolean isValide(final String stringInput) {
        int cont = stringInput.length();
        int aux = 0;
        for (String numS : stringInput.split("")) {
            aux += cont * Integer.parseInt(numS);
            --cont;
        }
        return aux % ONCE == 0;
    }


}
