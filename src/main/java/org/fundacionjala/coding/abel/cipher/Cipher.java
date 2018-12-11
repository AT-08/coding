package org.fundacionjala.coding.abel.cipher;

/**
 *
 */
public abstract class Cipher {
    /**
     *
     */
    protected static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    /**
     * @param string    string of input
     * @param condition num of variation
     * @return value return
     */
    public abstract String encode(String string, String condition);

    /**
     * @param string    string input
     * @param condition num of variation
     * @return value return
     */
    public abstract String decode(String string, String condition);

    /**
     * @param total value tortal
     * @return value of return
     */

    public int newPosition(int total) {
        while (total > ALPHABET.length()) {
            total -= ALPHABET.length();
        }
        return total;
    }
}
