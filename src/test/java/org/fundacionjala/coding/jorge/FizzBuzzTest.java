package org.fundacionjala.coding.jorge;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class FizzBuzzTest {

    private FizzBuzz fiBu;

    /**
     * Testing the FizzBuzz.
     */
    @Before
    public void setUp() {
        fiBu = new FizzBuzz();
    }

    /**
     *
     */
    @Test
    public void shouldConvert15To25Correctly() {
        final int num15 = 15;
        final int num25 = 25;
        int[]actual = new int[]{num15, num25};
        assertEquals("FizzBuzz 16 17 Fizz 19 Buzz Fizz 22 Fizz Fizz Buzz", fiBu.fizzBuzz(actual));
    }

    /**
     *
     */
    @Test
    public void shouldConvert45To50Correctly() {
        final int num45 = 45;
        final int num50 = 50;
        int[] actual = new int[]{num45, num50};
        assertEquals("FizzBuzz 46 47 Fizz 49 Buzz", fiBu.fizzBuzz(actual));
    }
    /**
     *
     */
    @Test
    public void shouldConvert51To55Correctly() {
        final int num51 = 51;
        final int num55 = 55;
        int[] actual = new int[]{num51, num55};
        assertEquals("Buzz Buzz Buzz Buzz Buzz", fiBu.fizzBuzz(actual));
    }
}
