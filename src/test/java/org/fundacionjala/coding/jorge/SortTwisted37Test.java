package org.fundacionjala.coding.jorge;

import org.junit.Test;
import org.junit.Assert;

/**
 *
 */
public class SortTwisted37Test {

    /**
     *
     */
    @Test
    public void test1() {
        final Integer[] actual = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        final Integer[] expected = new Integer[]{1, 2, 7, 4, 5, 6, 3, 8, 9};
        Assert.assertArrayEquals(expected, SortTwisted37
                .sortTwisted37(actual));
    }
    /**
     *
     */
    @Test
    public void test2() {
        final Integer[] actual = new Integer[]{12, 13, 14};
        final Integer[] expected = new Integer[]{12, 14, 13};
                Assert.assertArrayEquals(expected, SortTwisted37
                        .sortTwisted37(actual));
    }
    /**
     *
     */
    @Test
    public void test3() {
        final Integer[] actual = new Integer[]{9, 2, 4, 7, 3};
        final Integer[] expected = new Integer[]{2, 7, 4, 3, 9};
                Assert.assertArrayEquals(expected, SortTwisted37
                        .sortTwisted37(actual));
    }
}
