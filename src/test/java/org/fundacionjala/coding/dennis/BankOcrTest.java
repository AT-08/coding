package org.fundacionjala.coding.dennis;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class BankOcrTest {

    /**
     *
     */
    @Test
    public void testNormal1() {
        String line1 = "    _  _     _  _  _  _  _  _ ";
        String line2 = "  | _| _||_||_ |_   ||_||_|| |";
        String line3 = "  ||_  _|  | _||_|  ||_| _||_|";
        String exp = "1234567890";
        assertEquals(exp, BankOcr.decode(line1, line2, line3));
    }

    /**
     *
     */
    @Test
    public void testNormal2() {
        String line1 = " _  _  _  _  _  _  _  _  _  _ ";
        String line2 = "| || || || || || || || || || |";
        String line3 = "|_||_||_||_||_||_||_||_||_||_|";
        String exp = "0000000000";
        assertEquals(exp, BankOcr.decode(line1, line2, line3));
    }

    /**
     *
     */
    @Test
    public void testNormal3() {
        String line1 = "       _  _  _  _  _  _     _ ";
        String line2 = "  ||_|  | _||_||_  _| _|  ||_|";
        String line3 = "  |  |  ||_ |_| _||_  _|  ||_|";
        String exp = "1472852318";
        assertEquals(exp, BankOcr.decode(line1, line2, line3));
    }

    /**
     *
     */
    @Test
    public void testChecksumRight() {
        String line1 = "711111111";
        String exp = "711111111";
        assertEquals(exp, BankOcr.checks(line1));
    }

    /**
     *
     */
    @Test
    public void testChecksumRight2() {
        String line1 = "523";
        String exp = "523";
        assertEquals(exp, BankOcr.checks(line1));
    }

    /**
     *
     */
    @Test
    public void testChecksumWrong() {
        String line1 = "345882861";
        String exp = "345882861 ERR";
        assertEquals(exp, BankOcr.checks(line1));
    }

    /**
     *
     */
    @Test
    public void testChecksumWrong2() {
        String line1 = "830017243";
        String exp = "830017243 ERR";
        assertEquals(exp, BankOcr.checks(line1));
    }

    /**
     *
     */
    @Test
    public void testChecksumWrongCheck() {
        String test = "830017243";
        assertEquals(false, BankOcr.checksum(test));
    }

    /**
     *
     */
    @Test
    public void testChecksumRightCheck() {
        String test = "345882865";
        assertEquals(true, BankOcr.checksum(test));
    }

    /**
     *
     */
    @Test
    public void testNormalIll1() {
        String line1 = "?4588?86?";
        String exp = "?4588?86? ILL";
        assertEquals(exp, BankOcr.checks(line1));
    }

    /**
     *
     */
    @Test
    public void testNormalIll2() {
        String line1 = "2?0812??1";
        String exp = "2?0812??1 ILL";
        assertEquals(exp, BankOcr.checks(line1));
    }

    /**
     *
     */
    @Test
    public void testNormalIll3() {
        String line1 = "200812821";
        String exp = "200812821 ERR";
        assertEquals(exp, BankOcr.checks(line1));
    }
}
