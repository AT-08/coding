package org.fundacionjala.coding.rodrigo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test vowels.
 */
public class VowelsTest {
    private static final String NOPE = "Nope!";

    /**
     * Test case1.
     */
    @Test
    public void testCase1() {
        final int exp1 = 5;
        assertEquals(NOPE, exp1, Vowels.getCount("abracadabra"));
    }

    /**
     * Test Null 1.
     */
    @Test
    public void testNull() {
        final int exp2 = 0;
        assertEquals(NOPE, exp2, Vowels.getCount(""));
    }

    /**
     * Test case2.
     */
    @Test
    public void testCase2() {
        final int exp3 = 4;
        assertEquals(NOPE, exp3, Vowels.getCount("pear tree"));
    }

    /**
     * Test case3.
     */
    @Test
    public void testCase3() {
        final int exp4 = 13;
        assertEquals(NOPE, exp4, Vowels.getCount("o a kak ushakov lil vo kashu kakao"));
    }
}
