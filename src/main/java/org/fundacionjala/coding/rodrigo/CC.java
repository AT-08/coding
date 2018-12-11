package org.fundacionjala.coding.rodrigo;

/**
 *  The goal of this kata is to write a function that takes two inputs: a string and a character.
 * The function will count the number of times that character appears in the string. The count is case insensitive.
 */
public final class CC {
    /**
     * Constructor.
     */
    private CC() {

    }

    /**
     * This function count the characters about the problem.
     * @param str **Input String**
     * @param c **Character to count**
     * @return **Return the Number of the character appear**
     */
    public static int charCount(final String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.toUpperCase(ch) == Character.toUpperCase(c)) {
                count++;
            }
        }
        return count;
    }
}
