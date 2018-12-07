package org.fundacionjala.coding.dennis;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 *
 */
public class SortOddTest {

    private static final int[] DATA_NORMAL = {5, 3, 2, 8, 1, 4};
    private static final int[] RESULT_DATA_NORMAL = {1, 3, 2, 8, 5, 4};
    private static final int[] LIST_WITH_ZERO = {5, 3, 1, 8, 0};
    private static final int[] RESULT_LIST_WITH_ZERO = {1, 3, 5, 8, 0};
    private static final int[] LIST_WITH_DUPLICATE_NUMBER = {8, 78, 20, 3, 11, 30, 45, 11, 14};
    private static final int[] RESULT_LIST_WITH_DUPLICATE_NUMBER = {8, 78, 20, 3, 11, 30, 11, 45, 14};

    /**
     * Test Normal.
     */
    @Test
    public void testNormal() {
        assertArrayEquals(RESULT_DATA_NORMAL, SortOdd.sortArray(DATA_NORMAL));
    }

    /**
     * Test with zero in the list.
     */
    @Test
    public void testWithZero() {
        assertArrayEquals(RESULT_LIST_WITH_ZERO, SortOdd.sortArray(LIST_WITH_ZERO));
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
        assertArrayEquals(RESULT_LIST_WITH_DUPLICATE_NUMBER, SortOdd.sortArray(LIST_WITH_DUPLICATE_NUMBER));
    }
}
