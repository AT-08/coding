package org.fundacionjala.coding.wilson;

/**
 *
 */
public class EanValidation {

    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int TEN = 10;

    /**
     *
     * @param eanCode is a code
     * @return suma control
     */
    boolean validate(final String eanCode) {
        int sum = 0;
        String[] letter = eanCode.split("");
        for (int i = 0; i < eanCode.length() - 1; i++) {
            sum += i % TWO == 0 ? Integer.parseInt(letter[i]) : Integer.parseInt(letter[i]) * THREE;
        }
        final int checkSum = sum % TEN == 0 ? 0 : TEN - (sum % TEN);
        return Integer.parseInt(letter[eanCode.length() - 1]) == checkSum;
    }
}
