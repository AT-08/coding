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
        while (inNumber >  TEN - 1) {
            inNumber = inNumber % TEN + digitalroot(inNumber / TEN);
        }
        return inNumber;
    }
}
