package org.fundacionjala.coding.rodrigo;

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
    public void testSomething() {
        final int num = 4;
        assertEquals(num, CC.charCount("fizzbuzz", 'z'));
        assertEquals(num, CC.charCount("FIZZBUZZ", 'z'));
        assertEquals(num * 2, CC.charCount("fizzbuzz FIZZBUZZ", 'z'));
    }
}
