package org.fundacionjala.coding.dennis;
//https://www.codewars.com/kata/sum-of-digits-slash-digital-root

/**
 *
 */
public final class DigitalRoot {

    private static final int TEN = 10;

    /**
     *
     */
    private DigitalRoot() {

    }

    /**
     *
     * @param inNumber data to apply function.
     * @return digital root of inNumber.
     */
    public static int digitalroot(int inNumber) {
        int result = inNumber;
        while (!isOneDigitNumber(result)) {
            result = root(result);
        }
        return result;
    }

    /**
     *
     * @param inNumber data to evaluate.
     * @return boolean to know if number is only one digit.
     */
    private static boolean isOneDigitNumber(int inNumber) {
        int digitCount = String.valueOf(inNumber).length();
        return digitCount == 1;
    }

    /**
     *
     * @param inNumber data to know a partial root
     * @return partial root (it can be more than 2 digits length).
     */
    private static int root(int inNumber) {
        return isOneDigitNumber(inNumber) ? inNumber : inNumber % TEN + root(inNumber / TEN);
    }
}
