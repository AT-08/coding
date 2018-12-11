package org.fundacionjala.coding.abel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class HighestAndLowestTest {

    private HighestAndLowest instance;

    /**
     *
     */
    @Before
    public void test() {
        instance = new HighestAndLowest();

    }

    /**
     *
     */
    @Test
    public void test1() {
        final String actual = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        final String expected = "42 -9";
        assertEquals(expected, instance.highAndLow(actual));
    }

    /**
     *
     */
    @Test
    public void test3() {
        final String actual = "42 42";
        final String expected = "42 42";
        assertEquals(expected, instance.highAndLow(actual));
    }

    /**
     *
     */
    @Test
    public void test2() {
        final String actual = "-4 -2 4";
        final String expected = "4 -4";
        assertEquals(expected, instance.highAndLow(actual));
    }

}
