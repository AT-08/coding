package org.fundacionjala.coding.rodrigo;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Class for test the kata "sort the odd".
 */
public class SortOddTest {

    /**
     * This method test the method sortArray of the class SortOdd.
     */
    @Test
    public void sortArray() {
        final int[] inputA1 = new int[]{5, 3, 2, 8, 1, 4};
        final int[] outputA1 = new int[]{1, 3, 2, 8, 5, 4};
        assertArrayEquals(outputA1, SortOdd.sortArray(inputA1));
        final int[] inputA2 = new int[]{5, 3, 1, 8, 0};
        final int[] outputA2 = new int[]{1, 3, 5, 8, 0};
        assertArrayEquals(outputA2, SortOdd.sortArray(inputA2));
        final int[] inputA3 = new int[]{};
        final int[] outputA3 = new int[]{};
        assertArrayEquals(outputA3, SortOdd.sortArray(inputA3));
    }
}
