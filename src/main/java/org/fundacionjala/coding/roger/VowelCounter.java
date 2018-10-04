package org.fundacionjala.coding.roger;

/**
 * Vowel count.
 */
final class VowelCounter {

   private static final String VOWELS = "aeiou";
    /**
     * Empty constructor.
     */
    private VowelCounter() {
    }
    /**
     * @param str input String.
     * @return Return the vowels.
     */
    public static int getCount(final String str) {
        int vowelsCount = 0;
        for (int i = 0; i < str.length(); i++) {
            vowelsCount += VOWELS.contains(str.substring(i, i + 1)) ? 1 : 0;
        }
        return vowelsCount;
    }
}
