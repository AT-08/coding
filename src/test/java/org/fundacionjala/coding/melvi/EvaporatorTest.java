package org.fundacionjala.coding.melvi;

import org.junit.Test;

import static org.fundacionjala.coding.melvi.Evaporator.evaporator;
import static org.junit.Assert.assertEquals;

/**
 *
 */
public class EvaporatorTest {
    /**
     *
     */

    @Test
    public void testEvaporatorOne() {
        final int ten = 10;
        final int expected = 22;
        assertEquals(expected, evaporator(ten, ten));
    }

    /**
     *
     */

    @Test
    public void testEvaporatorTwo() {
        final int threshold = 20;
        final int expected = 16;
        final int ten = 10;
        assertEquals(expected, evaporator(ten, threshold));
    }
}

