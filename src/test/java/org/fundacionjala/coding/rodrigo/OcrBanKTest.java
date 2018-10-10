package org.fundacionjala.coding.rodrigo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 */
public class OcrBanKTest {
    private static final String NUMBER = "000000051";

    /**
     * Test verifying two NUMBER.
     */
    @Test
    public void testConvertTwoNumber() {
        String s1 = " _    \n"
                .concat("  ||_|\n")
                .concat("  |  |");
        assertEquals("74", OcrBank.convertOcrToNumber(s1));
    }

    /**
     * Verifying some acc1.
     */
    @Test
    public void testConvertAcc1() {
        String s2 = "    _  _     _  _  _  _  _ \n"
                .concat("  | _| _||_||_ |_   ||_||_|\n")
                .concat("  ||_  _|  | _||_|  ||_| _|");
        assertEquals("123456789", OcrBank.convertOcrToNumber(s2));
        assertEquals("123456789", OcrBank.verificationIllErr(OcrBank.convertOcrToNumber(s2)));
    }

    /**
     * Verifying some acc2.
     */
    @Test
    public void testConvertAcc2() {
        String s3 = " _  _  _  _  _  _  _  _    \n"
                .concat("| || || || || || || ||_   |\n")
                .concat("|_||_||_||_||_||_||_| _|  |");
        assertEquals(NUMBER, OcrBank.convertOcrToNumber(s3));
        assertEquals(NUMBER, OcrBank.verificationIllErr(OcrBank.convertOcrToNumber(s3)));
    }

    /**
     * Verifying some acc3 with ill.
     */
    @Test
    public void testConvertAcc3() {
        String s4 = "    _  _     _  _  _  _  _ \n"
                .concat("  | _| _||_| _ |_   ||_||_|\n")
                .concat("  ||_  _|  | _||_|  ||_| _ ");
        assertEquals("1234?678?", OcrBank.convertOcrToNumber(s4));
        assertEquals("1234?678? ILL", OcrBank.verificationIllErr(OcrBank.convertOcrToNumber(s4)));
    }

    /**
     * Verifying ILL.
     */
    @Test
    public void testIll1() {
        String s5 = "    _  _  _  _  _  _     _ \n"
                .concat("|_||_|| || ||_   |  |  | _ \n")
                .concat("  | _||_||_||_|  |  |  | _|");
        assertEquals("49006771? ILL", OcrBank.verificationIllErr(OcrBank.convertOcrToNumber(s5)));
    }

    /**
     * ERR test.
     */
    @Test
    public void testErr() {
        String s5 = "    _  _  _  _  _  _     _ \n"
                .concat("|_||_|| || ||_   |  |  | _|\n")
                .concat("  | _||_||_||_|  |  |  | _|");
        assertEquals("490067713 ERR", OcrBank.verificationIllErr(OcrBank.convertOcrToNumber(s5)));
    }

    /**
     * Check the function Checksum.
     */
    @Test
    public void checkSumTest() {
        assertTrue(OcrBank.checkSum(NUMBER));
    }

    /**
     * False.
     */
    @Test
    public void checkSumTestFalse() {
        assertFalse(OcrBank.checkSum("100000051"));
    }
}
