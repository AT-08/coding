package org.fundacionjala.coding.nestor;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * Class to sort inner content.
 */
public class SortInnerContent {

    /**
     * Main method.
     *
     * @param words type string.
     * @return a new string with inner ordered.
     */
    public String sortTheInnerContent(final String words) {
        return Arrays.stream(words.split(" "))
                .map(e -> e.length() > 2 ? e.substring(0, 1)
                        .concat(sortString(e.substring(1, e.length() - 1)))
                        .concat(e.substring(e.length() - 1)) : e)
                .collect(Collectors.joining(" "));
    }

    /**
     * Helper to sort inner container string.
     *
     * @param inputString Type String.
     * @return string ordered.
     */
    private static String sortString(final String inputString) {
        String[] tempArray = inputString.split("");
        Arrays.sort(tempArray, Comparator.reverseOrder());
        return String.join("", tempArray);
    }
}
