package org.fundacionjala.coding.roger;

/**
 * Kata 2.
 */

public final class CounterCharacter {

    /**
     * Empty constructor.
     */

    private CounterCharacter() {
    }

    /**
     * @param str input String.
     * @param c   input char.
     * @return Return the num of chars.
     */

    public static int charCount(final String str, char c) {
        int charCount = 0;
        for (int i = 0; i < str.length(); i++) {
            charCount += str.toLowerCase().substring(i, i + 1)
                    .contains(Character.toString(c).toLowerCase()) ? 1 : 0;
        }
        return charCount;
    }
}
