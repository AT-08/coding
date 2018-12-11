package org.fundacionjala.coding.abel.cipher;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class VigenereTest {
    private Vigenere instance;
    private static final String LIMON = "LIMON";
    private static final String EXPECTED_1 = "TXYP XMUNHCRC";
    private static final String ACTUAL_1 = "HOLA JALASOFT";
    private static final String EXPECTED_2 = "HOLA 5";
    private static final String ACTUAL_2 = "TXYP 5";

    /**
     *
     */
    @Before
    public void before() {
        instance = new Vigenere();
    }

    /**
     *
     */
    @Test
    public void test1() {
        assertEquals(EXPECTED_1, instance.encode(ACTUAL_1, LIMON));
    }


    /**
     *
     */
    @Test
    public void test7() {
        assertEquals(ACTUAL_1, instance.decode(EXPECTED_1, LIMON));
    }

    /**
     *
     */
    @Test
    public void test0() {
        assertEquals(ACTUAL_2, instance.encode(EXPECTED_2, LIMON));
    }

    /**
     *
     */
    @Test
    public void test8() {
        assertEquals(EXPECTED_2, instance.decode(ACTUAL_2, LIMON));
    }


    /**
     *
     */
    @Test
    public void test6() {

        final String expected = "TX4";
        final String actual = "HO4";
        assertEquals(expected, instance.encode(actual, LIMON));
    }

    /**
     *
     */
    @Test
    public void test3() {
        final String expected = "TXY$ P";
        final String actual = "HOL$ A";
        assertEquals(expected, instance.encode(actual, LIMON));
    }

    /**
     *
     */

    @Test
    public void test5() {

        final String expected = "TXY5 P";
        final String actual = "HOL5 A";
        assertEquals(expected, instance.encode(actual, LIMON));
    }

    /**
     *
     */
    @Test
    public void test2() {
        final String expected = "";
        final String actual = "";
        assertEquals(expected, instance.encode(actual, LIMON));
    }


}
