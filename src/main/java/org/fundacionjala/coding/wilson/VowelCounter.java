package org.fundacionjala.coding.wilson;

import java.util.Arrays;
import java.util.List;

/**
 * Some text here.
 */

public final class VowelCounter {
    private static final List<Character> VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u');

    /**
     * Some text here.
     */

    private VowelCounter() {

    }

    /**
     * @param str input is String
     * @return the number vowels
     */
    public static int vowelCount(final String str) {
        int vowels = 0;
        for (int i = 0; i < str.length(); i++) {
            char aux = str.charAt(i);
            if (VOWELS.contains(aux)) {
                vowels++;
            }
        }
        return vowels;
    }
}
