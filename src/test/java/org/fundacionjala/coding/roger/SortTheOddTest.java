package org.fundacionjala.coding.roger;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * Unit Tests.
 *
 */
public class SortTheOddTest {

    /**
     * Test 1.
     */
    @Test
    public void exampleTest1() {
        final int[] input = new int[]{1, 3, 2, 8, 5, 4};
        final int[] output = {5, 3, 2, 8, 1, 4 };
        assertArrayEquals(input, SortTheOdd.sortArray(output));
    }

    /**
     * Test 2.
     */
    @Test
    public void exampleTest2() {
        final int[] input = new int[]{1, 3, 5, 8, 0};
        final int[] output = new int[]{5, 3, 1, 8, 0};

        assertArrayEquals(input, SortTheOdd.sortArray(output));
    }

    /**
     * Test 3.
     */
    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, SortTheOdd.sortArray(new int[]{}));
    }
}
