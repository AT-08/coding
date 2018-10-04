package org.fundacionjala.coding.melvi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class SolutionTest {
    /**
     *
     */
    @Test
    public void testSomething() {
        final int count = 4;
        assertEquals(count, CC.charCount("fizzbuzz", 'z'));
        assertEquals(count, CC.charCount("FIZZBUZZ", 'z'));
    }
}
