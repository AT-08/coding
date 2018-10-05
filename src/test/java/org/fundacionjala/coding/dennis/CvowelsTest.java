package org.fundacionjala.coding.dennis;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Period.
 *
 */
public class CvowelsTest {
    public static final int EXP5 = 5;
    public static final int EXP15 = 15;
    public static final int EXP0 = 0;
    public static final int EXP3 = 3;

    /**
     *
     */
    @Test
    public void testCountVowelPass() {
        assertEquals(EXP5, Cvowels.vowels("abracadabra"));
    }

    /**
     *
     */
    @Test
    public void testCountVowelNull() {
        assertEquals(EXP0, Cvowels.vowels(""));
    }

    /**
     *
     */
    @Test
    public void testCountVowelWithout() {
        assertEquals(EXP0, Cvowels.vowels("psg"));
    }

    /**
     *
     */
    @Test
    public void testCountVowelOnlyVowels() {
        assertEquals(EXP15, Cvowels.vowels("aoeuiaeiouuoiea"));
    }

    /**
     *
     */
    @Test
    public void testCountVowelNumbers() {
        assertEquals(EXP0, Cvowels.vowels("15978"));
    }

    /**
     *
     */
    @Test
    public void testCountVowelWithSpaces() {
        assertEquals(EXP3, Cvowels.vowels("uno dos"));
    }

    /**
     *
     */
    @Test
    public void testCountVowelOnlySpaces() {
        assertEquals(EXP0, Cvowels.vowels("   "));
    }

}
