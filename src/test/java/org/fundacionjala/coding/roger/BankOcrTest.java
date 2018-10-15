package org.fundacionjala.coding.roger;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
/**
 * Unit Tests BankOcr.
 *
 */
public class BankOcrTest {

    private BankOcr bankOcr;
    /**
     * SETUP.
     *
     */
    @Before
    public void setUp() {
        bankOcr = new BankOcr();
    }
    /**
     * Test convert to number.
     */
    @Test
    public void testOcrToNumber1() {
        String s1 = "    _  _  _  _  _  _     _ ";
        String s2 = "|_||_|| || ||_   |  |  | _|";
        String s3 = "  | _||_||_||_|  |  |  | _|";

        assertEquals("490067713", bankOcr.toNumber(s1, s2, s3));
    }
    /**
     * Test convert to number and verify number.
     */
    @Test
    public void testOcrToNumber2() {
        String s4 = "    _  _     _  _  _  _    ";
        String s5 = "  | _| _||_||_ |_   ||_||_|";
        String s6 = "  ||_  _|  | _||_|  ||_|  |";
        assertEquals("123456784", bankOcr.toNumber(s4, s5, s6));
        assertEquals("123456784 ERR", bankOcr.verify(bankOcr.toNumber(s4, s5, s6)));
    }
    /**
     * Test verify checksum number.
     */
    @Test
    public void testCheckSumTrue() {
        String s7 = "    _  _     _  _  _  _  _ ";
        String s8 = "  | _| _||_||_ |_   ||_||_|";
        String s9 = "  ||_  _|  | _||_|  ||_| _|";
        assertTrue(bankOcr.checksum(bankOcr.toNumber(s7, s8, s9)));
    }
    /**
     * Test verify checksum number.
     */
    @Test
    public void testCheckSumFalse() {
        String sa = " _  _     _  _        _  _ ";
        String sb = "|_ |_ |_| _|  |  ||_||_||_ ";
        String sc = "|_||_|  | _|  |  |  | _| _|";
        assertFalse(bankOcr.checksum(bankOcr.toNumber(sa, sb, sc)));
    }
    /**
     * Test verify ERR number.
     */
    @Test
    public void testErrNumber() {
        String sd = " _  _     _  _        _    ";
        String se = "|_ |_ |_| _|  |  ||_||_||_|";
        String sf = "|_||_|  | _|  |  |  | _|  |";
        assertEquals("664371494 ERR",   bankOcr.verify(bankOcr.toNumber(sd, se, sf)));
    }

    /**
     * Test verify ILL number.
     */
    @Test
    public void testIllNumber() {
        String st1 = " _        _  _        _  _ ";
        String st2 = "|_ |_ |_| _   |  ||_|| ||_ ";
        String st3 = "|_|  |  | _|  |  |  | _| _ ";
        assertEquals("6?4?714?? ILL",   bankOcr.verify(bankOcr.toNumber(st1, st2, st3)));
    }
    /**
     * Test verify number.
     */
    @Test
    public void testNumber() {
        String sA = " _  _  _  _  _  _  _  _    ";
        String sB = "| || || || || || || ||_   |";
        String sC = "|_||_||_||_||_||_||_| _|  |";
        assertEquals("000000051",   bankOcr.verify(bankOcr.toNumber(sA, sB, sC)));
    }

}
