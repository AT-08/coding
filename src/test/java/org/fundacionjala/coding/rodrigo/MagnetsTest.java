package org.fundacionjala.coding.rodrigo;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Class for test the Magnet Class.
 */
public class MagnetsTest {
    /**
     * Creating a new assert for have a range of error.
     *
     * @param actual   result.
     * @param expected result.
     */
    private static void assertFuzzyEquals(double actual, double expected) {
        final double error = 1e-6;
        boolean inrange = Math.abs(actual - expected) <= error;
        assertTrue(inrange);
    }

    /**
     * Test of the result when k=1 and n=10.
     */
    @Test
    public void testK10N10() {
        final double expected = 0.5580321939764581;
        final int maxn = 10;
        final int maxk = 1;
        assertFuzzyEquals(Magnets.doubles(maxk, maxn), expected);
    }

    /**
     * Test of the result when k=10 and n=1000.
     */
    @Test
    public void testK10N1000() {
        final int maxk = 10;
        final int maxn = 1000;
        final double expected = 0.6921486500921933;
        assertFuzzyEquals(Magnets.doubles(maxk, maxn), expected);
    }

    /**
     * Test of the result when k=10 and n=10000.
     */
    @Test
    public void testK10N10000() {
        final int maxk = 10;
        final int maxn = 10000;
        final double expected = 0.6930471674194457;
        assertFuzzyEquals(Magnets.doubles(maxk, maxn), expected);
    }

    /**
     * Test of the result when k=20 and n=10000.
     */
    @Test
    public void testK20N10000() {
        final int maxk = 20;
        final int maxn = 10000;
        final double expected = 0.6930471955575918;
        assertFuzzyEquals(Magnets.doubles(maxk, maxn), expected);
    }
}
