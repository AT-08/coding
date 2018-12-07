package org.fundacionjala.coding.dennis;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 *
 */
public class SortOddTest {

    private final int[] dataNormal = {5, 3, 2, 8, 1, 4};
    private final int[] resultDataNormal = {1, 3, 2, 8, 5, 4};
    private final int[] listWithZero = {5, 3, 1, 8, 0};
    private final int[] resultListWithZero = {1, 3, 5, 8, 0};
    private final int[] listWithDuplicateNumber = {8, 78, 20, 3, 11, 30, 45, 11, 14};
    private final int[] resultListWithDuplicateNumber = {8, 78, 20, 3, 11, 30, 11, 45, 14};

    /**
     * Test Normal.
     */
    @Test
    public void testNormal() {
        assertArrayEquals(resultDataNormal, SortOdd.sortArray(dataNormal));
    }

    /**
     * Test with zero in the list.
     */
    @Test
    public void testWithZero() {
        assertArrayEquals(resultListWithZero, SortOdd.sortArray(listWithZero));
    }

    /**
     * test with empty list.
     */
    @Test
    public void testEmptyList() {
        assertArrayEquals(new int[]{}, SortOdd.sortArray(new int[]{}));
    }


    /**
     * Test with duplicate numbers.
      */
    @Test
    public void testWithDuplicateNumbers() {
        assertArrayEquals(resultListWithDuplicateNumber, SortOdd.sortArray(listWithDuplicateNumber));
    }
}
