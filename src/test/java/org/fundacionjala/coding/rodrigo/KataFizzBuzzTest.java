package org.fundacionjala.coding.rodrigo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test of FizzBuzz.
 */
public class KataFizzBuzzTest {
    private KataFizzBuzz kataFizzBuzz;

    /**
     * Setting the class.
     */
    @Before
    public void setUp() {
        kataFizzBuzz = new KataFizzBuzz();
    }

    /**
     * Test of 5 first numbers.
     */
    @Test
    public void fizzBuzzTest() {
        final int num = 5;
        assertEquals("1\n2\nFizz\n4\nBuzz", kataFizzBuzz.fizzBuzz(num));
    }

    /**
     * Test of the class changeFB.
     */
    @Test
    public void convertNumberTestFizzBuzz() {
        final int num = 15;
        assertEquals("FizzBuzz", KataFizzBuzz.changeFB(num));
    }

    /**
     * Test to probe Fizz.
     */
    @Test
    public void convertNumberTestFizz() {
        final int num = 3;
        assertEquals("Fizz", KataFizzBuzz.changeFB(num));
    }

    /**
     * Test to probe Buzz.
     */
    @Test
    public void convertNumberTestBuzz() {
        final int num = 5;
        assertEquals("Buzz", KataFizzBuzz.changeFB(num));
    }

    /**
     * Test to probe any number.
     */
    @Test
    public void convertNumberTestAnyNumber() {
        final int num1 = 1;
        final int num2 = 13;
        final int num3 = 29;
        assertEquals("1", KataFizzBuzz.changeFB(num1));
        assertEquals("Fizz", KataFizzBuzz.changeFB(num2));
        assertEquals("29", KataFizzBuzz.changeFB(num3));
    }

    /**
     * Test the second part.
     */
    @Test
    public void secondPart() {
        final int num13 = 13;
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\nFizz",
                kataFizzBuzz.fizzBuzz(num13));
    }

    /**
     * Test the newReq.
     */
    @Test
    public void singleNumberScnd() {
        final int num50 = 52;
        assertEquals("Buzz", KataFizzBuzz.changeFB(num50));
    }
}

