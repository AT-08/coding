package org.fundacionjala.coding.melvi;

/**
<<<<<<< HEAD
 * A lot of goods have an International Article Number (formerly known as "European
 * Article Number") abbreviated "EAN". EAN is a 13-digits barcode consisting of
 * 12-digits data followed by a single-digit checksum (EAN-8 is not considered in this kata).
 * <p>
 * <p>
 * The single-digit checksum is calculated as followed (based upon the 12-digit data):
 * <p>
 * The digit at the first, third, fifth, etc. position (i.e. at the odd position) has to be multiplied with "1".
 * The digit at the second, fourth, sixth, etc. position (i.e. at the even position) has to be multiplied with "3".
 * Sum these results.
 * <p>
 * If this sum is dividable by 10, the checksum is 0. Otherwise the checksum has the following formula:
 * <p>
 * checksum = 10 - (sum mod 10)
 * <p>
 * For example, calculate the checksum for "400330101839" (= 12-digits data):
 * <p>
 * 4·1 + 0·3 + 0·1 + 3·3 + 3·1 + 0·3 + 1·1 + 0·3 + 1·1 + 8·3 + 3·1 + 9·3
 * = 4 + 0 + 0 + 9 + 3 + 0 + 1 + 0 + 1 + 24 + 3 + 27
 * = 72
 * 10 - (72 mod 10) = 8 ⇒ Checksum: 8
 * <p>
 * Thus, the EAN-Code is 4003301018398 (= 12-digits data followed by single-digit checksum).
 * <p>
 * Your Task.
 * Validate a given EAN-Code. Return true if the given EAN-Code is valid, otherwise false.
 * Assumption
 * You can assume the given code is syntactically valid, i.e. it only consists of numbers and it exactly
 * has a length of 13 characters.
 * Examples.
 * EANValidator.validate("4003301018398") // True.
 * EANValidator.validate("4003301018392") // False.
 */
public final class EANValidator {

    public static final int THREE = 3;
    public static final int TEN = 10;

    /**
     *
     */
    private EANValidator() {
    }

    /**
     * @param eanCode code to validate
     * @return true if valid
     */
    public static boolean validate(final String eanCode) {
        //Your code
        int suma = 0;
        for (int i = 0; i < eanCode.length() - 1; i++) {
            int digit = Integer.parseInt(eanCode.substring(i, i + 1));
            suma += i % 2 == 0 ? digit : Math.multiplyExact(digit, THREE);
        }
        int last = Integer.parseInt(eanCode.substring(eanCode.length() - 1));
        long checkSum = suma % TEN == 0 ? 0 : TEN - (suma % TEN);
        return last == checkSum;

    }

}
