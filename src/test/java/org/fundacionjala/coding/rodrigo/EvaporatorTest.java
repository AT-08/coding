package org.fundacionjala.coding.rodrigo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Testing the evaporator.
 */
public class EvaporatorTest {
    private Evaporator evaporator;

    /**
     * Setting up the class.
     */
    @Before
    public void setUp() {
        evaporator = new Evaporator();
    }

    /**
     * Test one.
     */
    @Test
    public void evaporatorOne() {
        final int e1 = 22;
        final int ten = 10;
        assertEquals(e1, evaporator.evaporator(ten, ten, ten));
    }

    /**
     * Test two.
     */
    @Test
    public void testEvaporatorTwo() {
        final int e2 = 29;
        final int ten = 10;
        final int thd = 5;


        assertEquals(e2, evaporator.evaporator(ten, ten, thd));
    }

    /**
     * Test Three.
     */
    @Test
    public void testEvaporatorThree() {
        final int e3 = 59;
        final int cnt = 100;
        final int five = 5;
        assertEquals(e3, evaporator.evaporator(cnt, five, five));
    }

}
