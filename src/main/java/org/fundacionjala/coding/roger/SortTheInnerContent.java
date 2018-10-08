package org.fundacionjala.coding.roger;

import java.util.StringJoiner;
import java.util.Arrays;
import java.util.Collections;

/**
 * You have to sort the inner content of every word of a string in descending order.
 * The inner content is the content of a word without first and the last char.
 */


public final class SortTheInnerContent {

    public static final int LIMIT = 3;

    /**
     * Empty constructor.
     */
    private SortTheInnerContent() {
    }

    /**
     * @param words input String.
     * @return return the string sort the inner content.
     */

    public static String sortTheInnerContent(final String words) {
        StringJoiner sj = new StringJoiner(" ");
        for (String word : words.trim().split(" ")) {
            sj.add(word.length() > LIMIT ? word.substring(0, 1)
                    .concat(orderDescending(word.substring(1, word.length() - 1)))
                    .concat(word.substring(word.length() - 1)) : word);
        }
        return sj.toString();
    }

    /**
     * This method inverts the characters of a string.
     *
     * @param word input String.
     * @return return the string inverts.
     */

    public static String orderDescending(final String word) {
        String[] arrayChars = word.split("");
        Arrays.sort(arrayChars, Collections.reverseOrder());
        return String.join("", arrayChars);
    }
}
