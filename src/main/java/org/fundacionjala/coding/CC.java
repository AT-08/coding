package org.fundacionjala.coding;

/**
 *
 */
public final class CC {

    /**
     *
     */
    private CC() {
    }

    /**
     *
     * @param str string to process
     * @param c character to find
     * @return count
     */
    public static int charCount(final String str, char c) {
        // your code here
        char[] characters = str.toCharArray();
        int cont = 0;
        for (char i : characters) {
            if (Character.toUpperCase(i) == Character.toUpperCase(c)) {
            cont++;
            }
        }
        return cont;
    }
}
