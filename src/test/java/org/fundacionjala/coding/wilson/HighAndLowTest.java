package org.fundacionjala.coding.wilson;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 *
 */
public class HighAndLowTest {

    /**
     *
     */
    @Test
    public void sortTest() {
        assertThat(HighAndLow.methodHighAndLow("10 2 -2 -10"), is("10 -10"));
    }

    /**
     *
     */
    @Test
    public void someTest() {
        assertThat(HighAndLow.methodHighAndLow("4 5 29 54 4 0 -214 542 -64 2 -3 6 -6"), is("542 -214"));
    }

    /**
     *
     */
    @Test
    public void plusMinusTest() {
        assertThat(HighAndLow.methodHighAndLow("1 -1"), is("1 -1"));
    }

    /**
     *
     */
    @Test
    public void plusPlusTest() {
        assertThat(HighAndLow.methodHighAndLow("1 1"), is("1 1"));
    }

    /**
     *
     */
    @Test
    public void minusMinusTest() {
        assertThat(HighAndLow.methodHighAndLow("-1 -1"), is("-1 -1"));
    }

    /**
     *
     */
    @Test
    public void plusMinusZeroTest() {
        assertThat(HighAndLow.methodHighAndLow("1 -1 0"), is("1 -1"));
    }
}
