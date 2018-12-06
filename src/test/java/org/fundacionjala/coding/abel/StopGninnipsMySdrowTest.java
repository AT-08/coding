package org.fundacionjala.coding.abel;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class StopGninnipsMySdrowTest {

    private StopGninnipsMySdrow instance;

    /**
     *
     */

    @Before
    public void before() {
        instance = new StopGninnipsMySdrow();

    }

    /**
     *
     */
    @Test
    public void testOneString() {
        assertEquals("emocleW", instance.spinWords("Welcome"));

    }

    /**
     *
     */
    @Test
    public void testTwoOrMoreChains() {
        assertEquals("Hey wollef sroirraw", instance.spinWords("Hey fellow warriors"));

    }

    /**
     *
     */
    @Test
    public void testTwoOrMoreChainsNull() {
        assertEquals("", instance.spinWords(""));

    }


}
