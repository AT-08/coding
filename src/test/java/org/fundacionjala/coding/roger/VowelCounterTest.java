package org.fundacionjala.coding.roger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Test VowelVounter.
 */
public class VowelCounterTest {
    private static final String NOPE = "Nope!";

    /**
     * Test case1.
     */
    @Test
    public void testCase1() {
        final int exp1 = 5;
        assertEquals(NOPE, exp1, VowelCounter.getCount("abracadabra"));
    }


    /**
     * Test Null 1.
     */
    @Test
    public void testNull() {
        final int exp2 = 0;
        assertEquals(NOPE, exp2, VowelCounter.getCount(""));
    }

    /**
     * Test case2.
     */
    @Test
    public void testCase2() {
        final int exp3 = 5;
        assertEquals(NOPE, exp3, VowelCounter.getCount("are you happy?"));
    }

    /**
     * Test case3.
     */
    @Test
    public void testCase3() {
        final int exp4 = 9;
        assertEquals(NOPE, exp4, VowelCounter.getCount("hola a todo como estan"));
    }
}
