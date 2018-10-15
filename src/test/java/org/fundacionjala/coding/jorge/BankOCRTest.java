package org.fundacionjala.coding.jorge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class BankOCRTest {

    /**
     *
     */
    @Test
    public void testScanner1() {
        String line1 = "    _  _     _  _  _  _  _  _ ";
        String line2 = "  | _| _||_||_ |_   ||_||_|| |";
        String line3 = "  ||_  _|  | _||_|  ||_| _||_|";
        String exp = "1234567890";
        assertEquals(exp, BankOCR.decode(line1, line2, line3));
    }

    /**
     *
     */
    @Test
    public void testScanner2() {
        String line1 = " _  _  _  _  _  _  _  _  _  _ ";
        String line2 = "| || || || || || || || || || |";
        String line3 = "|_||_||_||_||_||_||_||_||_||_|";
        String exp = "0000000000";
        assertEquals(exp, BankOCR.decode(line1, line2, line3));
    }

    /**
     *
     */
    @Test
    public void testScanner3() {
        String line1 = "       _  _  _  _  _  _     _ ";
        String line2 = "  ||_|  | _||_||_  _| _|  ||_|";
        String line3 = "  |  |  ||_ |_| _||_  _|  ||_|";
        String exp = "1472852318";
        assertEquals(exp, BankOCR.decode(line1, line2, line3));
    }

    /**
     *
     */
    @Test
    public void testChecksum1() {
        String line1 = "711111111";
        String exp = "711111111";
        assertEquals(exp, BankOCR.checks(line1));
    }

    /**
     *
     */
    @Test
    public void testChecksum2() {
        String line1 = "523";
        String exp = "523";
        assertEquals(exp, BankOCR.checks(line1));
    }

    /**
     *
     */
    @Test
    public void testChecksumWrong1() {
        String line1 = "345882861";
        String exp = "345882861 ERR";
        assertEquals(exp, BankOCR.checks(line1));
    }

    /**
     *
     */
    @Test
    public void testChecksumWrong2() {
        String line1 = "830017243";
        String exp = "830017243 ERR";
        assertEquals(exp, BankOCR.checks(line1));
    }

    /**
     *
     */
    @Test
    public void testChecksumWrongCheck() {
        String line1 = "830017243";
        assertEquals(false, BankOCR.checksum(line1));
    }

    /**
     *
     */
    @Test
    public void testChecksum() {
        String line1 = "345882865";
        assertEquals(true, BankOCR.checksum(line1));
    }

    /**
     *
     */
    @Test
    public void testChecks1() {
        String line1 = "?4588?86?";
        String exp = "?4588?86? ILL";
        assertEquals(exp, BankOCR.checks(line1));
    }

    /**
     *
     */
    @Test
    public void testChecks2() {
        String line1 = "2?0812??1";
        String exp = "2?0812??1 ILL";
        assertEquals(exp, BankOCR.checks(line1));
    }

    /**
     *
     */
    @Test
    public void testChecks3() {
        String line1 = "200812821";
        String exp = "200812821 ERR";
        assertEquals(exp, BankOCR.checks(line1));
    }
}
