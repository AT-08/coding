package org.fundacionjala.coding.sortdescending;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Kata about Sort the inner content of a sentence.
 */
public final class Kata {
    /**
     * Empty constructor.
     */
    private Kata() {
    }

    /**
     * @param words Input Word
     * @return Sort the inner content of the word
     */
    public static String sortTheInnerContent(final String words) {
        String[] origWords = words.split(" ");
        for (int i = 0; i < origWords.length; i++) {
            if (origWords[i].length() > 2) {
                origWords[i] = descendingSort(origWords[i]);
            }
        }
        return String.join(" ", origWords);
    }

    /**
     * @param word Input Separated word
     * @return Sort descending
     */
    private static String descendingSort(final String word) {
        char[] w = word.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 1; i < w.length - 1; i++) {
            list.add(w[i]);
        }
        list.sort(Comparator.reverseOrder());
        list.add(0, w[0]);
        list.add(w.length - 1, w[w.length - 1]);
        return list.stream()
                .map(e -> Character.toString(e))
                .collect(Collectors.joining());
    }
}
