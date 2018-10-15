package org.fundacionjala.coding.abel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class BankOCRTest {
    /**
     *
     */
    private BankOCR instance;

    /**
     *
     */
    @Before
    public void before() {
        instance = new BankOCR();
    }

    /**
     *
     */
    @Test
    public void test1() {
        String line1 = "    _  _     _  _  _  _  _  _ ";
        String line2 = "  | _| _||_||_ |_   ||_||_|| |";
        String line3 = "  ||_  _|  | _||_|  ||_| _||_|";
        String exp = "1234567890";
        assertEquals(exp, instance.scanner(line1, line2, line3));
    }

    /**
     *
     */
    @Test
    public void test2() {
        String line1 = " _  _  _  _  _  _  _  _  _  _ ";
        String line2 = "| || || || || || || || || || |";
        String line3 = "|_||_||_||_||_||_||_||_||_||_|";
        String exp = "0000000000";
        assertEquals(exp, instance.scanner(line1, line2, line3));
    }

    /**
     *
     */
    @Test
    public void test3() {
        String line1 = "       _  _  _  _  _  _     _ ";
        String line2 = "  ||_|  | _||_||_  _| _|  ||_|";
        String line3 = "  |  |  ||_ |_| _||_  _|  ||_|";
        String exp = "1472852318";
        assertEquals(exp, instance.scanner(line1, line2, line3));
    }

    /**
     *
     */
    @Test
    public void test4() {
        String line1 = " _     _  _  _  _  _  _  _ ";
        String line2 = " _||_||_ |_||_| _||_||_ |_ ";
        String line3 = " _|  | _||_||_||_ |_||_| _|";
        String exp = "345882865";
        assertEquals(exp, instance.checksum(instance.scanner(line1, line2, line3)));
    }

    /**
     *
     */
    @Test
    public void test5() {
        String line1 = " _  _  _ ";
        String line2 = "|_  _| _|";
        String line3 = " _||_  _|";
        String exp = "523";
        assertEquals(exp, instance.checksum(instance.scanner(line1, line2, line3)));
    }

    /**
     *
     */
    @Test
    public void test6() {
        String line1 = " _     _  _  _  _  _  _    ";
        String line2 = " _||_||_ |_||_| _||_||_   |";
        String line3 = " _|  | _||_||_||_ |_||_|  |";
        String exp = "345882861 ERR";
        assertEquals(exp, instance.checksum(instance.scanner(line1, line2, line3)));
    }

    /**
     *
     */
    @Test
    public void test7() {
        String line1 = " _  _  _  _     _  _     _ ";
        String line2 = "|_| _|| || |  |  | _||_| _|";
        String line3 = "|_| _||_||_|  |  ||_   | _|";
        String exp = "830017243 ERR";
        assertEquals(exp, instance.checksum(instance.scanner(line1, line2, line3)));
    }

    /**
     *
     */

    @Test
    public void test8() {
        String line1 = " _  _  _        _  _       ";
        String line2 = "|_| _|| || |  |  | _||_| _|";
        String line3 = "|_| _||_|| |  |  ||_   | _|";
        String exp = "830?1724? ILL";
        assertEquals(exp, instance.checksum(instance.scanner(line1, line2, line3)));
    }

    /**
     *
     */


}
