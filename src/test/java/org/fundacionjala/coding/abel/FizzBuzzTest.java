package org.fundacionjala.coding.abel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * this class make to test a the FizzBuzz class.
 */
public class FizzBuzzTest {

    private FizzBuzz instance;

    /**
     * instance of FizzBuzz class.
     */
    @Before
    public void before() {
        instance = new FizzBuzz();
    }

    /**
     * test fist part.
     */
    @Test
    public void convertNumberTestAnyNumber() {
        final int num1 = 1;
        final int num = 5;
        final int num13 = 13;
        final int num29 = 29;
        final int num15 = 15;
        final int num93 = 93;

        assertEquals("1", instance.generated(num1));
        assertEquals("Buzz", instance.generated(num));
        assertEquals("Fizz", instance.generated(num13));
        assertEquals("29", instance.generated(num29));
        assertEquals("FizzBuzz", instance.generated(num15));
        assertEquals("Fizz", instance.generated(num93));
    }

    /**
     * Test the second part.
     */
    @Test
    public void secondPart() {
        final int num13 = 13;
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\nFizz",
                instance.fizzBuzz(num13));
    }

}
