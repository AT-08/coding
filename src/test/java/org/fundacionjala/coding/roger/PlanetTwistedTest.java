package org.fundacionjala.coding.roger;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
/**
 * Unit Tests.
 *
 */
public class PlanetTwistedTest {

    private PlanetTwisted planet;
    /**
     * Setting the class.
     */
    @Before
    public void setUp() {
        planet = new PlanetTwisted();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        final Integer[] actual = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final Integer[] expected = {1, 2, 7, 4, 5, 6, 3, 8, 9};
        assertArrayEquals(expected, planet.sortTwisted37(actual));
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        final Integer[] actual = {9, 2, 4, 7, 3};
        final Integer[] expected = {2, 7, 4, 3, 9};
        assertArrayEquals(expected, planet.sortTwisted37(actual));
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        final Integer[] actual = {12, 13, 14};
        final Integer[] expected = {12, 14, 13};
        assertArrayEquals(expected, planet.sortTwisted37(actual));
    }
}
