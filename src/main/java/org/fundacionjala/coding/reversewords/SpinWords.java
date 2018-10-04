package org.fundacionjala.coding.reversewords;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Kata spinning words.
 */
public final class SpinWords {
    /**
     * Empty Constructor.
     */
    public SpinWords() {
    }

    /**
     * @param sentence Input
     * @return The correct sentence.
     */
    public String spinWords(final String sentence) {
        final int wordFlag = 4;
        return Arrays.stream(sentence.split(" "))
                .map(word -> word.length() > wordFlag
                        ? new StringBuilder(word).reverse().toString() : word)
                .collect(Collectors.joining(" "));
    }
}
