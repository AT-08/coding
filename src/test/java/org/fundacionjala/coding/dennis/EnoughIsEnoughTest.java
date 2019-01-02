package org.fundacionjala.coding.dennis;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 *
 */
public class EnoughIsEnoughTest {

    private static final int THREE_TIMES = 3;
    private static final int FIVE_TIMES = 5;

    /**
     *
     */
    @Test
    public void testEnoughIsEnough() {
        final int[] dataOut1 = new int[] {20, 37, 21};
        final int[] dataIn1 = new int[] {20, 37, 20, 21};
        assertArrayEquals(dataOut1, EnoughIsEnough.deleteNth(dataIn1, 1));
        final int[] dataOut2 = new int[] {1, 1, 3, 3, 7, 2, 2, 2};
        final int[] dataIn2 = new int[] {1, 1, 3, 3, 7, 2, 2, 2, 2};
        assertArrayEquals(dataOut2, EnoughIsEnough.deleteNth(dataIn2, THREE_TIMES));
        final int[] dataOut3 = new int[] {1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5};
        final int[] dataIn3 = new int[] {1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1};
        assertArrayEquals(dataOut3, EnoughIsEnough.deleteNth(dataIn3, THREE_TIMES));
        final int[] dataOut4 = new int[] {1, 1, 1, 1, 1};
        final int[] dataIn4 = new int[] {1, 1, 1, 1, 1};
        assertArrayEquals(dataOut4, EnoughIsEnough.deleteNth(dataIn4, FIVE_TIMES));
        final int[] dataOut5 = new int[] {};
        final int[] dataIn5 = new int[] {};
        assertArrayEquals(dataOut5, EnoughIsEnough.deleteNth(dataIn5, FIVE_TIMES));
        final int[] dataOut6 = new int[] {1, 1, 1};
        final int[] dataIn6 = new int[] {1, 1, 1, 1, 1};
        assertArrayEquals(dataOut6, EnoughIsEnough.deleteNth(dataIn6, THREE_TIMES));
    }
}
