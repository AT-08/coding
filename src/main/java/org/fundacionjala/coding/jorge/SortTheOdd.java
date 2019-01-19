package org.fundacionjala.coding.jorge;

import java.util.Arrays;

/**
 * Class SortTheOdd.
 * https://www.codewars.com/kata/sort-the-odd/train/java
 */

final class SortTheOdd {

    /**
     * The class constructor.
     */
    private SortTheOdd() {
    }

    /**
     * This method sort the array except odd numbers and zero numbers.
     *
     * @param array of numbers.
     * @return the sorted array except odd numbers.
     */
    public static int[] sortArray(final int[] array) {
        int[] container = Arrays.stream(array).filter(x -> x % 2 != 0).sorted().toArray();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                    array[i] = container[count];
                    count++;
            }
        }
        return array;
    }
}
