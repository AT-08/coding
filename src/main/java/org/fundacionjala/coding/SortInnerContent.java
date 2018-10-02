package org.fundacionjala.coding;

import java.util.Arrays;
import java.util.Comparator;

/**
 * class to solve the kata.
 */
public final class SortInnerContent {

    public static final String REGEX = " ";
    public static final int LIMIT = 3;

    /**
     * constructor.
     */
    private SortInnerContent() {

    }

    /**
     * @param words initial word
     * @return word processed
     */

    public static String sortTheInnerContent(final String words) {
        String[] words1 = words.split(REGEX);
        for (int i = 0; i < words1.length; i++) {
            if (words1[i].length() > LIMIT) {
                words1[i] = words1[i].substring(0, 1)
                        .concat(ordenar(words1[i].substring(1, words1[i].length() - 1)))
                        .concat(words1[i].substring(words1[i].length() - 1));

            }
        }
        return String.join(REGEX, words1);
    }

    /**
     * @param cad word to sort
     * @return cad sorted
     */
    public static String ordenar(final String cad) {
        String[] letters = cad.split("");
        Arrays.sort(letters, Comparator.reverseOrder());
        return String.join("", letters);
    }


}

