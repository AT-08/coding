package org.fundacionjala.coding.jorge;
/**
 *
 */

import java.util.Arrays;

/**
 * Empty constructor.
 */
public final class EanCodeValidator {

    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int TEN = 10;

    /**
     *
     */
    private EanCodeValidator() {
    }

    /**
     * @param eanCode input strigsdfsdfsdf
     * @return values of return
     */
    public static boolean validate(final String eanCode) {
        String cadena = eanCode.substring(0, eanCode.length() - 1);
        int[] arrayNum = Arrays.asList(cadena.split("")).stream().mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        int lastDigit = Character.getNumericValue(eanCode.charAt(eanCode.length() - 1));
        for (int i = 0; i < arrayNum.length; i++) {
            sum += i % TWO == 0 ? arrayNum[i] : arrayNum[i] * THREE;
        }
        sum = sum % TEN == 0 ? 0 : TEN - (sum % TEN);
        return sum == lastDigit;
    }
}
