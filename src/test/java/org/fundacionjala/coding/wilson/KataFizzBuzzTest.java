package org.fundacionjala.coding.wilson;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class KataFizzBuzzTest {
    private KataFizzBuzz fizzBuzz;

    /**
     *
     */
    @Before
    public void setUp() {
        fizzBuzz = new KataFizzBuzz();
    }

    /**
     *
     */
    @Test
    public void fizzBuzzTest() {
        final int num = 5;
        assertEquals("1\n2\nFizz\n4\nBuzz", fizzBuzz.fizzBuzz(num));
    }

    /**
     *
     */
    @Test
    public void convertNumberTestFizzBuzz() {
        final int num = 15;
        assertEquals("FizzBuzz", KataFizzBuzz.sendString(num));
    }

    /**
     *
     */
    @Test
    public void convertNumberTestFizz() {
        final int num = 3;
        assertEquals("Fizz", KataFizzBuzz.sendString(num));
    }

    /**
     *
     */
    @Test
    public void convertNumberTestBuzz() {
        final int num = 5;
        assertEquals("Buzz", KataFizzBuzz.sendString(num));
    }

    /**
     *
     */
    @Test
    public void convertNumberTestAnyNumber() {
        final int num1 = 1;
        final int num2 = 13;
        final int num3 = 29;
        assertEquals("1", KataFizzBuzz.sendString(num1));
        assertEquals("Fizz", KataFizzBuzz.sendString(num2));
        assertEquals("29", KataFizzBuzz.sendString(num3));
    }

    /**
     *
     */
    @Test
    public void secondPart() {
        final int num13 = 13;
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\nFizz",
                fizzBuzz.fizzBuzz(num13));
    }

    /**
     *
     */
    @Test
    public void singleNumberScnd() {
        final int num50 = 52;
        assertEquals("Buzz", KataFizzBuzz.sendString(num50));
    }
}
