package org.fundacionjala.coding.rodrigo;

import java.util.Arrays;

/**
 * Class for solve the problem "Sort the odd".
 * https://www.codewars.com/kata/sort-the-odd/train/java
 */
final class SortOdd {
    /**
     * Empty constructor.
     */
    private SortOdd() {
    }

    /**
     * This method sort the array of int.
     *
     * @param array input array for sort.
     * @return the sorted array.
     */
    static int[] sortArray(final int[] array) {
        int[] aux = Arrays.stream(array).filter(x -> x % 2 != 0).sorted().toArray();
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = aux[j];
                j++;
            }
        }
        return array;
    }
}
