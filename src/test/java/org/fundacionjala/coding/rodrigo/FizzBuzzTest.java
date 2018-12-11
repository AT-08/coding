package org.fundacionjala.coding.rodrigo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test of FizzBuzz.
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
    public void fizzBuzzTest() {
        final int num = 5;
        assertEquals("1\n2\nFizz\n4\nBuzz", fizzBuzz.fizzBuzz(num));
    }

    /**
     * Test of the class changeFB.
     */
    @Test
    public void convertNumberTestFizzBuzz() {
        final int num = 15;
        assertEquals("FizzBuzz", FizzBuzz.changeFB(num));
    }

    /**
     * Test to probe Fizz.
     */
    @Test
    public void convertNumberTestFizz() {
        final int num = 3;
        assertEquals("Fizz", FizzBuzz.changeFB(num));
    }

    /**
     * Test to probe Buzz.
     */
    @Test
    public void convertNumberTestBuzz() {
        final int num = 5;
        assertEquals("Buzz", FizzBuzz.changeFB(num));
    }

    /**
     * Test to probe any number.
     */
    @Test
    public void convertNumberTestAnyNumber() {
        final int num1 = 1;
        final int num2 = 13;
        final int num3 = 29;
        assertEquals("1", FizzBuzz.changeFB(num1));
        assertEquals("Fizz", FizzBuzz.changeFB(num2));
        assertEquals("29", FizzBuzz.changeFB(num3));
    }

    /**
     * Test the second part.
     */
    @Test
    public void secondPart() {
        final int num13 = 13;
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\nFizz",
                fizzBuzz.fizzBuzz(num13));
    }

    /**
     * Test the newReq.
     */
    @Test
    public void singleNumberScnd() {
        final int num50 = 52;
        assertEquals("Buzz", FizzBuzz.changeFB(num50));
    }
}

