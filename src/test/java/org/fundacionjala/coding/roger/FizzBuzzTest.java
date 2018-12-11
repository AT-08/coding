package org.fundacionjala.coding.roger;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Unit tests.
 */
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;
    /**
     * Setting the class.
     */
    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }
    /**
     * Test of 5 first numbers.
     */
    @Test
    public void testFiveNumbers() {
        final int five = 5;
        assertEquals("1\n2\nFizz\n4\nBuzz", fizzBuzz.fizzBuzzNumbers(five));
    }
    /**
     * Test of 10 first numbers.
     */
    @Test
    public void testTenNumbers() {
        final int ten = 10;
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz", fizzBuzz.fizzBuzzNumbers(ten));
    }
    /**
     * Test of number 18.
     */
    @Test
    public void testOneNumber18() {
        final int eighteen = 18;
        assertEquals("Fizz", fizzBuzz.fizzBuzzNumber(eighteen));
    }
    /**
     * Test of number51.
     */
    @Test
    public void testOneNumber51() {
        final int fiftyone = 51;
        assertEquals("Fizz", fizzBuzz.fizzBuzzNumber(fiftyone));
    }
    /**
     * Test of number15.
     */
    @Test
    public void testOneNumber15() {
        final int fifteen = 15;
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzzNumber(fifteen));
    }
    /**
     * Test of number30.
     */
    @Test
    public void testOneNumber30() {
        final int thirty = 30;
        assertEquals("FizzBuzz", fizzBuzz.fizzBuzzNumber(thirty));
    }
    /**
     * Test of number13.
     */
    @Test
    public void testOneNumber13() {
        final int thirteen = 13;
        assertEquals("Fizz", fizzBuzz.fizzBuzzNumber(thirteen));
    }
    /**
     * Test of number58.
     */
    @Test
    public void testOneNumber58() {
        final int fiftyeight = 58;
        assertEquals("Buzz", fizzBuzz.fizzBuzzNumber(fiftyeight));
    }

}
