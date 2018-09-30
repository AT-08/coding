package org.fundacionjala.coding.nestor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@Link CounterCharacter}.
 */
public class CounterCharacterTest {
    static final int APPEARS = 4;

    /**
     * Verify if appear when string is lower case.
     */
    @Test
    public void charCountLowerCase() {
        CounterCharacter cc = new CounterCharacter();
        assertEquals(APPEARS, cc.charCount("fizzbuzz", 'z'));
    }

    /**
     * Verify if appear when string is upper case.
     */
    @Test
    public void charCountUpperCase() {
        CounterCharacter cc = new CounterCharacter();
        assertEquals(APPEARS, cc.charCount("FIZZBUZZ", 'z'));
    }
}
