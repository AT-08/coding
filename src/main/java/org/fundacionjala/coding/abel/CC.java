package org.fundacionjala.coding.abel;

/**
 * The goal of this kata is to write a function that takes two inputs:
 * a string and a character. The function will count the number of times that character
 * appears in the string. The count is case insensitive
 */

public final class CC {
    /**
     *
     */
    private CC() {

    }

    /**
     * @param str is variable for imput string
     * @param c   is the character
     * @return the num of characters in the string
     */
    public static int charCount(final String str, char c) {
        char cLowCase = Character.toLowerCase(c);
        final String wordToLowerCase = str.toLowerCase();
        int accountant = 0;
        for (int i = 0; i < wordToLowerCase.length(); i++) {
            if (wordToLowerCase.charAt(i) == cLowCase) {
                accountant++;
            }
        }
        return accountant;
    }
}
