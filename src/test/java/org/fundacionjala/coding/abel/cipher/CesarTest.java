package org.fundacionjala.coding.abel.cipher;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class CesarTest {

    private Cesar instance;


    private static final String EXPECTED_GLOBAL = "ETWWT T";
    private static final String ACTUAL_GLOBAL = "ZORRO O";

    /**
     *
     */
    @Before
    public void before() {
        instance = new Cesar();
    }


    /**
     *
     */
    @Test
    public void test1() {
        final String parameter = "31";
        assertEquals(EXPECTED_GLOBAL, instance.encode(ACTUAL_GLOBAL, parameter));
    }


    /**
     *
     */
    @Test
    public void test2() {
        final String parameter = "5";
        assertEquals(EXPECTED_GLOBAL, instance.encode(ACTUAL_GLOBAL, parameter));
    }

    /**
     *
     */
    @Test
    public void test3() {
        final String expected = "ZORRO";
        final String actual = "ETWWT";
        final String parameter = "5";
        assertEquals(expected, instance.decode(actual, parameter));
    }

    /**
     *
     */


    @Test
    public void test4() {
        final String parameter = "5";
        assertEquals(ACTUAL_GLOBAL, instance.decode(EXPECTED_GLOBAL, parameter));
    }

    /**
     *
     */

    @Test
    public void test6() {
        final String expected = "909 O";
        final String actual = "909 T";
        final String parameter = "5";
        assertEquals(expected, instance.decode(actual, parameter));
    }

    /**
     *
     */
    @Test
    public void test7() {
        final String parameter = "5";
        assertEquals("", instance.decode("", parameter));
    }


}
