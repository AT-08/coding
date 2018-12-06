package org.fundacionjala.coding.melvi;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

/**
 *
 */
public class Twisted37Tests {
    /**
     *
     */
    @Test
    public void testKataLongArray() {
        final Integer[] expected = new Integer[]{1, 2, 7, 4, 5, 6, 3, 8, 9};
        final Integer[] test = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Assert.assertArrayEquals(expected, Twisted37.sortTwisted37(test));
    }

    /**
     *
     */
    @Test
    public void testKataGreaterThanTen() {
        final Integer[] expected = new Integer[]{12, 14, 13};
        final Integer[] test = new Integer[]{12, 13, 14};
        assertEquals(Arrays.toString(expected), Arrays.toString(Twisted37.sortTwisted37(test)));
    }

    /**
     *
     */
    @Test
    public void testKataShortArray() {
        final Integer[] expected = new Integer[]{2, 7, 4, 3, 9};
        final Integer[] test = new Integer[]{9, 2, 4, 7, 3};
        assertEquals(Arrays.toString(expected), Arrays.toString(Twisted37.sortTwisted37(test)));
    }
}
