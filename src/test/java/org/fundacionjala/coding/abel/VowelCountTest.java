package org.fundacionjala.coding.abel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 *
 */
public class VowelCountTest {

    public static final int EXP5 = 5;
    public static final int EXP15 = 15;
    public static final int EXP0 = 0;
    public static final int EXP3 = 3;

    /**
     *
     */
    @Test
    public void testCountVowelPass() {
        assertEquals(EXP5, VowelCount.getCount("abracadabra"));
    }

    /**
     *
     */
    @Test
    public void testCountVowelNull() {
        assertEquals(EXP0, VowelCount.getCount(""));
    }

    /**
     *
     */
    @Test
    public void testCountVowelWithout() {
        assertEquals(EXP0, VowelCount.getCount("dsvg"));
    }

    /**
     *
     */
    @Test
    public void testCountVowelOnlyVowels() {
        assertEquals(EXP15, VowelCount.getCount("aoeuiaeiouuoiea"));
    }

    /**
     *
     */
    @Test
    public void testCountVowelNumbers() {
        assertEquals(EXP0, VowelCount.getCount("15978"));
    }

    /**
     *
     */
    @Test
    public void testCountVowelWithSpaces() {
        assertEquals(EXP3, VowelCount.getCount("uno dos"));
    }

    /**
     *
     */
    @Test
    public void testCountVowelOnlySpaces() {
        assertEquals(EXP0, VowelCount.getCount("   "));
    }


}
