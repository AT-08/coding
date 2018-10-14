package org.fundacionjala.coding.jorge;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 *
 */
public final class SortTheInnerContent {

    /**
     *
     */

    private SortTheInnerContent() {
    }

    /**
     * @param words given type String
     * @return sj given type StringBuilder
     */
    public static String sortTheContent(final String words) {
        StringJoiner sj = new StringJoiner(" ");
        String[] wordsArr = words.split(" ");
        final int limit = 3;
        for (String word : wordsArr) {
            sj.add(word.length() > limit ? word.substring(0, 1)
                    .concat(reverse(word.substring(1, word.length() - 1).toCharArray()))
                    .concat(word.substring(word.length() - 1)) : word);
        }
        return sj.toString();
    }

    /**
     * @param chars given type String
     * @return sb given type String
     */
    private static String reverse(final char[] chars) {
        Arrays.sort(chars);
        return new StringBuilder(String.valueOf(chars)).reverse().toString();
    }
}
