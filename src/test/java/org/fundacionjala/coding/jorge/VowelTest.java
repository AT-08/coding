package org.fundacionjala.coding.jorge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Period.
 *
 */
public class VowelTest {
    public static final int EXP5 = 5;
    /**
     *
     */
    @Test
    public void testCountVowelPass() {
        assertEquals(EXP5, Vowel.getCount("abracadabra"));
    }
}
