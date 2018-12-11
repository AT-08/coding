package org.fundacionjala.coding.dennis;

/**
 *
 */

final class CountChar {
    /**
     *
     */
    private CountChar() {
    }
    /**
     *
     * @param str Arreglo de enteros
     * @param c character to find
     * @return String
     */
    protected static int charCount(final String str, char c) {
        return str.replaceAll(String.format("(?i)[^%s]", c), "").length();
    }
}
