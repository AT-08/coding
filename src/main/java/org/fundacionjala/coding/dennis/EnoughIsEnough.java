package org.fundacionjala.coding.dennis;

import java.util.ArrayList;

/**
 * https://www.codewars.com/kata/delete-occurrences-of-an-element-if-it-occurs-more-than-n-times.
 */
public final class EnoughIsEnough {

    /**
     *
     */
    private EnoughIsEnough() {

    }

    /**
     *
     * @param elements array of integers.
     * @param maxOccurrences limit of Occurrences.
     * @return array of integers with values limited.
     */
    public static int[] deleteNth(final int[] elements, int maxOccurrences) {
        ArrayList<Integer> list = new ArrayList(1);
        for (int numb : elements) {
            if (list.stream().filter(e -> e == numb).count() < maxOccurrences) {
                list.add(numb);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
