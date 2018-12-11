package org.fundacionjala.coding.rodrigo;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Kata spinning words.
 */
class SpinWords {

    /**
     * @param sentence Input
     * @return The correct sentence.
     */
    String spinWords(final String sentence) {
        final int wordFlag = 4;
        return Arrays.stream(sentence.split(" "))
                .map(word -> word.length() > wordFlag
                        ? new StringBuilder(word).reverse().toString() : word)
                .collect(Collectors.joining(" "));
    }
}
