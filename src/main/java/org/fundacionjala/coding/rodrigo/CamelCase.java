package org.fundacionjala.coding.rodrigo;

/**
 * Write simple .toCC method (camel_case function in PHP, rodrigo in C# or toCC in Java) for strings.
 * All words must have their first letter capitalized without spaces.
 * <p>
 * For instance:
 * <p>
 * toCC("hello case"); // => "HelloCase"
 * toCC("camel case word"); // => "CamelCaseWord"
 */

public final class CamelCase {

    /**
     * The constructor.
     */
    private CamelCase() {
    }

    /**
     * @param str **Input String**
     * @return **return the String in CamelCase**
     */
    public static String toCC(final String str) {

        String[] words = str.trim().split(" ");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                    words[i] = words[i].substring(0, 1).toUpperCase().concat(words[i].substring(1));
            }
        }
        return String.join("", words);
    }

}
