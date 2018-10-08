package org.fundacionjala.coding.abel;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class FizzBuzzTest {


    private FizzBuzz instance;
    private List<String> list = new ArrayList<String>();
    private List<String> list2 = new ArrayList<String>();

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = "FizzBuzz";

    /**
     *
     */
    @Before
    public void before() {
        instance = new FizzBuzz();
        list = instance.fizzbuzz();
        list2 = instance.fizzBuzz2();
    }

    /**
     *
     */
    @Test
    public void test() {
        final int num = 2;
        assertEquals(FIZZ, list.get(num));
    }

    /**
     *
     */
    @Test
    public void test2() {
        final int num2 = 4;
        assertEquals(BUZZ, list.get(num2));
    }

    /**
     *
     */
    @Test
    public void test3() {
        final int num3 = 14;
        assertEquals(FIZZ_BUZZ, list.get(num3));
    }

    /**
     *
     */
    @Test
    public void test4() {
        final int num3 = 59;
        assertEquals(FIZZ_BUZZ, list.get(num3));
    }

    /**
     *
     */
    @Test
    public void test5() {
        final int num3 = 12;
        assertEquals(FIZZ, list2.get(num3));
    }

    /**
     *
     */
    @Test
    public void test6() {
        final int num3 = 35;
        assertEquals(FIZZ, list2.get(num3));
    }

    /**
     *
     */
    @Test
    public void test7() {
        final int num3 = 24;
        assertEquals(BUZZ, list2.get(num3));
    }

    /**
     *
     */

    @Test
    public void test8() {
        final int num3 = 52;
        assertEquals(FIZZ_BUZZ, list2.get(num3));
    }

}
