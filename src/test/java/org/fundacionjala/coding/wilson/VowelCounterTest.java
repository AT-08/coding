package org.fundacionjala.coding.wilson;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Some text here.
 */

public class VowelCounterTest {
    private static final String N = "Nope!";

    /**
     *
     */
    @Test
    public void testNull() {
        final int expected = 0;
        assertEquals(N, expected, VowelCounter.vowelCount(""));
    }

    /**
     *
     */
    @Test
    public void testCase2() {
        final int expected = 4;
        assertEquals(N, expected, VowelCounter.vowelCount("pear tree"));
    }

    /**
     *
     */
    @Test
    public void testCase3() {
        final int expected = 13;
        assertEquals(N, expected, VowelCounter.vowelCount("o a kak ushakov lil vo kashu kakao"));
    }
}
