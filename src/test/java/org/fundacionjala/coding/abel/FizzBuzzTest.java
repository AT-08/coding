package org.fundacionjala.coding.abel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class FizzBuzzTest {
    private FizzBuzz instance;
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = "FizzBuzz";

    /**
     *
     */
    @Before
    public void before() {
        instance = new FizzBuzz();
    }

    /**
     *
     */
    @Test
    public void test() {
        final int num = 3;
        assertEquals(FIZZ, instance.fizzBuzz2(num));
    }

    /**
     *
     */
    @Test
    public void test2() {
        final int num2 = 5;
        assertEquals(BUZZ, instance.fizzBuzz2(num2));
    }

    /**
     *
     */
    @Test
    public void test3() {
        final int num3 = 15;
        assertEquals(FIZZ_BUZZ, instance.fizzBuzz2(num3));
    }

    /**
     *
     */
    @Test
    public void test4() {
        final int num3 = 60;
        assertEquals(FIZZ_BUZZ, instance.fizzBuzz2(num3));
    }

    /**
     *
     */
    @Test
    public void test5() {
        final int num3 = 13;
        assertEquals(FIZZ, instance.fizzBuzz2(num3));
    }


    /**
     *
     */
    @Test
    public void test6() {
        final int num3 = 36;
        assertEquals(FIZZ, instance.fizzBuzz2(num3));
    }

    /**
     *
     */
    @Test
    public void test7() {
        final int num3 = 25;
        assertEquals(BUZZ, instance.fizzBuzz2(num3));
    }

    /**
     *
     */
    @Test
    public void test9() {
        final int num3 = 59;
        assertEquals(BUZZ, instance.fizzBuzz2(num3));
    }

    /**
     *
     */
    @Test
    public void test10() {
        final int num3 = 50;
        assertEquals(BUZZ, instance.fizzBuzz2(num3));
    }

    /**
     *
     */
    @Test
    public void test11() {
        final int num3 = 52;
        assertEquals(BUZZ, instance.fizzBuzz2(num3));
    }
}
