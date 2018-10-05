package org.fundacionjala.coding.dennis;

/**
 *
 */
public final class CountVowels {

    /**
     *
     */
    private CountVowels() {
    }

    /**
     *
     * @param str Cadena
     * @return Cadena
     */
    public static int vowels(final String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
}
