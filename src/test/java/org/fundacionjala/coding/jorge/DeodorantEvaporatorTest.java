package org.fundacionjala.coding.jorge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class DeodorantEvaporatorTest {
    private DeodorantEvaporator evaporator;

    /**
     * Testing the evaporator.
     */
    @Before
    public void setUp() {
        evaporator = new DeodorantEvaporator();
    }

    /**
     * Test one.
     */
    @Test
    public void testEvaporatorOne() {
        final int expected = 22;
        final int ten = 10;
        assertEquals(expected, evaporator.evaporator(ten, ten, ten));
    }

    /**
     * Test two.
     */
    @Test
    public void testEvaporatorTwo() {
        final int expected = 29;
        final int ten = 10;
        final int five = 5;
        assertEquals(expected, evaporator.evaporator(ten, ten, five));
    }

    /**
     * Test Three.
     */
    @Test
    public void testEvaporatorThree() {
        final int expected = 59;
        final int oneHundred = 100;
        final int five = 5;
        assertEquals(expected, evaporator.evaporator(oneHundred, five, five));
    }
}
