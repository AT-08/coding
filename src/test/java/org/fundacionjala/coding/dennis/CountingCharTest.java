package org.fundacionjala.coding.dennis;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class CountingCharTest {

    public static final int EXP5 = 5;
    public static final int EXP0 = 0;
    public static final int EXP2 = 2;
    /**
     *
     */
    @Test
    public void testCountCharPass() {
        assertEquals(EXP5, CountChar.charCount("abracadabra", 'a'));
    }

    /**
     *
     */
    @Test
    public void testCountCharNull() {
        assertEquals(EXP0, CountChar.charCount("", 'a'));
    }

    /**
     *
     */
    @Test
    public void testCountCharWithout() {
        assertEquals(EXP0, CountChar.charCount("psg", 'a'));
    }

    /**
     *
     */
    @Test
    public void testCountCharSpaces() {
        assertEquals(EXP2, CountChar.charCount("a a b", 'a'));
    }

    /**
     *
     */
    @Test
    public void testCountCharNumbers() {
        assertEquals(EXP0, CountChar.charCount("  ", 'a'));
    }

    /**
     *last test.
     */
    @Test
    public void testCountCharSpace() {
        assertEquals(EXP2, CountChar.charCount("  ", ' '));
    }
}
