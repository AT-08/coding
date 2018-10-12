package org.fundacionjala.coding.jorge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for CC.
 */
public class CCTest {
    /**
     * Test some words for the kata.
     */
    @Test
    public void test1() {
        final int num = 4;
        assertEquals(num, CC.charCount("fizzbuzz", 'z'));
    }
    /**
     * Test some words for the kata.
     */
    @Test
    public void test2() {
        final int num = 4;
        assertEquals(num, CC.charCount("FIZZBUZZ", 'z'));
    }
    /**
     * Test some words for the kata.
     */
    @Test
    public void test3() {
        final int num = 4;
        assertEquals(num * 2, CC.charCount("fizzbuzz FIZZBUZZ", 'z'));
    }
}
