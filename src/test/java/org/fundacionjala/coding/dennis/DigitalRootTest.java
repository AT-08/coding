package org.fundacionjala.coding.dennis;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for Digital Root Kata.
 */
public class DigitalRootTest {

    private int data;
    private static final int ONE_DIGIT = 5;
    private static final int IN_TWO_DIGITS = 43;
    private static final int OUT_TWO_DIGITS_TEST = 7;
    private static final int IN_TWO_DIGITS_REC = 96;
    private static final int OUT_TWO_DIGITS_REC_TEST = 6;
    private static final int IN_MORE_DIGITS = 493193;
    private static final int OUT_MORE_DIGITS = 2;

    /**
     * If input is one digit, output is the same digit.
     */
    @Test
    public void testOneDigit() {
        data = ONE_DIGIT;
        assertEquals(ONE_DIGIT, DigitalRoot.digitalroot(data));
    }

    /**
     *
     */
    @Test
    public void testTwoDigitsOutputOneDigit() {
        data = IN_TWO_DIGITS;
        assertEquals(OUT_TWO_DIGITS_TEST, DigitalRoot.digitalroot(data));
    }

    /**
     *
     */
    @Test
    public void testTwoDigitsOutputMoreThanOneDigit() {
        data = IN_TWO_DIGITS_REC;
        assertEquals(OUT_TWO_DIGITS_REC_TEST, DigitalRoot.digitalroot(data));
    }

    /**
     *
     */
    @Test
    public void testMoreThanTwoDigits() {
        data = IN_MORE_DIGITS;
        assertEquals(OUT_MORE_DIGITS, DigitalRoot.digitalroot(data));
    }
}
