package org.fundacionjala.coding.roger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test CounterCharacter.
 */

public class CounterCharacterTest {

    /**
     * Test 1.
     */

    @Test
    public void testSomething() {
        final int expectedResult = 4;
        final int expectedResult1 = 5;
        assertEquals(expectedResult, CounterCharacter.charCount("fizzbuzz", 'z'));
        assertEquals(expectedResult1, CounterCharacter.charCount("FIZZBUZZZ", 'z'));
    }

    /**
     * Test 2.
     */

    @Test
    public void testCharUpperCase() {
        final int expectedResult = 4;
        final int expectedResult1 = 6;
        assertEquals(expectedResult1, CounterCharacter.charCount("FinalfafffbeF ", 'F'));
        assertEquals(expectedResult, CounterCharacter.charCount("Drink Dronk drunkD", 'D'));
    }

    /**
     * Test 3.
     */

    @Test
    public void testWithSpace() {
        final int expectedResult = 5;
        final int expectedResult1 = 2;
        assertEquals(expectedResult1, CounterCharacter.charCount("paprica priCapa priori", ' '));
        assertEquals(expectedResult, CounterCharacter.charCount("Fresh fried fish food Fresh five", ' '));
    }
}
