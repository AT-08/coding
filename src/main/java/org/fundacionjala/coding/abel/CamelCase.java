package org.fundacionjala.coding.abel;

/**
 *
 */
public class CamelCase {


    /**
     * @param str sting of imput
     * @return value of return
     */
    public String camelCase(final String str) {

        String[] string = str.split(" ");

        for (int i = 0; i < string.length; i++) {
            string[i] = convertUpercase(string[i]);
        }
        return String.join("", string);
    }

    /**
     * @param str sting of imput
     * @return value of return
     */
    private static String convertUpercase(final String str) {
        if (str.isEmpty()) {
            return str;
        }
        return String.valueOf(Character.toUpperCase(str.charAt(0))).concat(str.substring(1));
    }
}
