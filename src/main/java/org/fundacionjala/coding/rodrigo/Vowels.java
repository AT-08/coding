package org.fundacionjala.coding.rodrigo;

import java.util.Arrays;
import java.util.List;

/**
 * Vowel count.
 */
public final class Vowels {

    private static final List<Character> VOWELS_LIST = Arrays.asList(
            'a',
            'e',
            'i',
            'o',
            'u');

    /**
     * Empty constructor.
     */
    private Vowels() {
    }

    /**
     * @param str input String.
     * @return Return the vowels.
     */
    public static int getCount(final String str) {
        int vowelsCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if (VOWELS_LIST.contains(a)) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }
}
