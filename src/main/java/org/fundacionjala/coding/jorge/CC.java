package org.fundacionjala.coding.jorge;
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
     * @param c  given type int
     * @param str given type String
     * @return given type int
     */
    public static int charCount(final String str, char c) {
        return str.replaceAll(String.format("(?i)[^%s]", c), "").length();
    }
}
