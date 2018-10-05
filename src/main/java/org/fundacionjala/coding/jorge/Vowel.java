package org.fundacionjala.coding.jorge;

/**
 *
 */
public final class Vowel {

    /**
     *
     */
    private Vowel() {
    }

    /**
     * Method getCount, count how many vowels exist in given string.
     *
     * @param given type String
     * @return int vowels count
     */
    public static int getCount(final String given) {
        int vowelsCount = 0;
        for (int i = 0; i < given.length(); i++) {
            if ("aeiou".indexOf(given.charAt(i)) >= 0) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
