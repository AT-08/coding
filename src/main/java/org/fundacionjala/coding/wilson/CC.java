package org.fundacionjala.coding.wilson;

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
     * @param str is a sentence
     * @param c is a model
     * @return cant c in the sentence
     */
    public static int charCount(final String str, final char c) {
        int sum = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch == Character.toLowerCase(c)) {
                sum++;
            }
        }
        return sum;
    }
}
