package org.fundacionjala.coding.roger;

/**
 * All words must have their first letter
 * capitalized without spaces.
 */

public final class Solution {


    /**
     * Empty constructor.
     */

    private Solution() {
    }

    /**
     *@param str input String.
     *@return return the string in camel case.
     */
    static String camelCase(final String str) {
        StringBuilder sb = new StringBuilder();
        for (String word: str.trim().split(" ")) {
            if (!word.isEmpty()) {
                sb.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));
            }
        }
        return sb.toString();
    }

}

