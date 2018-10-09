package org.fundacionjala.coding.roger;
/**
 * Kata 1
 * by Roger.
 *
 */
public class EANValidator {

    static final int TWO = 2;
    static final int THREE = 3;
    static final int TEN = 10;

    /**
     * Empty constructor.
     */
    private EANValidator() {
    }

    /**
     *@param eanCode input String.
     *@return return boolean validate EAN
     */
    public static boolean validate(final String eanCode) {
        int sum = 0;
        String[] letter = eanCode.split("");
        for (int i = 0; i < eanCode.length() - 1; i++) {
            sum += i % TWO == 0 ? Integer.parseInt(letter[i]) : Integer.parseInt(letter[i]) * THREE;
        }
        return Integer.parseInt(letter[eanCode.length() - 1]) == (sum % TEN == 0 ?  0 : TEN - (sum % TEN));
    }
}
