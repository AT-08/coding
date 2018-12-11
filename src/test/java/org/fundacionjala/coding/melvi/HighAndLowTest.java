package org.fundacionjala.coding.melvi;

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
    public void kataTestNumber1() {
        assertEquals("42 -9", HighAndLow.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    /**
     *
     */
    @Test
    public void kataTestNumber2() {
        assertEquals("5 1", HighAndLow.highAndLow("1 2 3 4 5"));
    }

    /**
     *
     */
    @Test
    public void kataTestNumber3() {
        assertEquals("5 -3", HighAndLow.highAndLow("1 2 -3 4 5"));
    }

    /**
     *
     */
    @Test
    public void kataTestNumber4() {
        assertEquals("2 2", HighAndLow.highAndLow("2"));
    }
}
