package org.fundacionjala.coding.jorge;

import java.util.Arrays;

/**
 *
 */
public final class SortTwisted37 {
    /**
     *
     */
    private static final char NUMBER_7 = '7';
    private static final char A = 'a';
    private static final char NUMBER_3 = '3';

    /**
     *
     */
    private SortTwisted37() {

    }

    /**
     * @param array to be sorted
     * @return sorted array
     */
    public static Integer[] sortTwisted37(final Integer[] array) {
        return Arrays.stream(array)
                .map(SortTwisted37::twist)
                .sorted()
                .map(SortTwisted37::twist)
                .toArray(Integer[]::new);
    }

    /**
     * @param i ....
     * @return ....
     */
    public static Integer twist(final Integer i) {
        String s1 = Integer.toString(i)
         .replace(NUMBER_3, A)
         .replace(NUMBER_7, NUMBER_3)
         .replace(A, NUMBER_7);
        return Integer.valueOf(s1);
    }
}
