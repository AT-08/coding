package org.fundacionjala.coding.jorge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class HighAndLowTest {

    /**
     *
     */
    @Test
    public void test1() {
        assertEquals("42 -9", HighAndLow.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
    /**
     *
     */
    @Test
    public void someTest() {
        assertEquals("542 -214", HighAndLow.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"));
    }
    /**
     *
     */
    @Test
    public void sortTest() {
        assertEquals("10 -10", HighAndLow.highAndLow("10 2 -2 -10"));
    }
    /**
     *
     */
    @Test
    public void plusMinusTest() {
        assertEquals("1 -1", HighAndLow.highAndLow("1 -1"));
    }
    /**
     *
     */
    @Test
    public void plusPlusTest() {
        assertEquals("1 1", HighAndLow.highAndLow("1 1"));
    }
    /**
     *
     */
    @Test
    public void minusMinusTest() {
        assertEquals("-1 -1", HighAndLow.highAndLow("-1 -1"));
    }
    /**
     *
     */
    @Test
    public void plusMinusZeroTest() {
        assertEquals("1 -1", HighAndLow.highAndLow("1 -1 0"));
    }
    /**
     *
     */
    @Test
    public void plusPlusZeroTest() {
        assertEquals("1 0", HighAndLow.highAndLow("1 1 0"));
    }
    /**
     *
     */
    @Test
    public void minusMinusZeroTest() {
        assertEquals("0 -1", HighAndLow.highAndLow("-1 -1 0"));
    }
    /**
     *
     */
    @Test
    public void singleTest() {
        assertEquals("42 42", HighAndLow.highAndLow("42"));
    }
}
