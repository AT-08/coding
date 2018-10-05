package org.fundacionjala.coding.abel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 *
 */
public class CCTest {
    public static final int EXP4 = 4;

    /**
     *
     */


    @Test
    public void testCharactetCountLowCase() {
        assertEquals(EXP4, CC.charCount("fizzbuzz", 'z'));
    }

    /**
     *
     */

    @Test
    public void testCharactetCountUpCase() {
        assertEquals(EXP4, CC.charCount("FIZZBUZZ", 'z'));
    }


}
