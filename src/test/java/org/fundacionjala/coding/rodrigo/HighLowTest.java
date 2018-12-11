package org.fundacionjala.coding.rodrigo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Test the HighLow kata.
 */
public class HighLowTest {

    /**
     * Test 1.
     */
    @Test
    public void highAndLow() {
        assertEquals("42 -9", HighLow.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    /**
     * Test 2.
     */
    @Test
    public void someTest() {
        assertThat(HighLow.highAndLow("4 5 29 54 4 0 -214 542 -64 1 -3 6 -6"), is("542 -214"));
    }

    /**
     * Test 3.
     */
    @Test
    public void sortTest() {
        assertThat(HighLow.highAndLow("10 2 -2 -10"), is("10 -10"));
    }

    /**
     * Test 4.
     */
    @Test
    public void plusMinusTest() {
        assertThat(HighLow.highAndLow("1 -1"), is("1 -1"));
    }

    /**
     * Test 5.
     */
    @Test
    public void plusPlusTest() {
        assertThat(HighLow.highAndLow("1 1"), is("1 1"));
    }

    /**
     * Test 6.
     */
    @Test
    public void minusMinusTest() {
        assertThat(HighLow.highAndLow("-1 -1"), is("-1 -1"));
    }

    /**
     * Test 7.
     */
    @Test
    public void plusMinusZeroTest() {
        assertThat(HighLow.highAndLow("1 -1 0"), is("1 -1"));
    }

    /**
     * Test 8.
     */
    @Test
    public void plusPlusZeroTest() {
        assertThat(HighLow.highAndLow("1 1 0"), is("1 0"));
    }

    /**
     * Test 9.
     */
    @Test
    public void minusMinusZeroTest() {
        assertThat(HighLow.highAndLow("-1 -1 0"), is("0 -1"));
    }

    /**
     * Test 10.
     */
    @Test
    public void singleTest() {
        assertThat(HighLow.highAndLow("42"), is("42 42"));
    }
}
