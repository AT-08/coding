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
        assertEquals("Fizz", list.get(num));
    }

    /**
     *
     */
    @Test
    public void test2() {
        final int num2 = 4;
        assertEquals("Buzz", list.get(num2));
    }

    /**
     *
     */
    @Test
    public void test3() {
        final int num3 = 14;
        assertEquals("FizzBuzz", list.get(num3));
    }

    /**
     *
     */
    @Test
    public void test4() {
        final int num3 = 59;
        assertEquals("FizzBuzz", list.get(num3));
    }

    /**
     *
     */
    @Test
    public void test5() {
        final int num3 = 12;
        assertEquals("Fizz", list2.get(num3));
    }

    /**
     *
     */
    @Test
    public void test6() {
        final int num3 = 35;
        assertEquals("Fizz", list2.get(num3));
    }

    /**
     *
     */
    @Test
    public void test7() {
        final int num3 = 24;
        assertEquals("Buzz", list2.get(num3));
    }

    /**
     *
     */

    @Test
    public void test8() {
        final int num3 = 52;
        assertEquals("FizzBuzz", list2.get(num3));
    }

}
