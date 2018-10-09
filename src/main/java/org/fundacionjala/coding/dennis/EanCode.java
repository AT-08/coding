package org.fundacionjala.coding.dennis;

/**
 *
 */
public final class EanCode {

    public static final int UNITY = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int TEN = 10;

    /**
     *
     */
    private EanCode() {

    }

    /**
     *
     * @param code numerical
     * @return true or false
     */
    public static boolean validate(final String code) {
        String codeNum = code.substring(0, code.length() - UNITY);
        int suma = 0;
        for (int d = 0; d < codeNum.length(); d++) {
            int digit = Character.getNumericValue(codeNum.charAt(d));
            suma += d % TWO == 0 ? digit : digit * THREE;
        }
        int finalChecksum = suma % TEN == 0 ? 0 : TEN - (suma % TEN);
        int checksumCode = Integer.parseInt(code.substring(code.length() - UNITY));
        return finalChecksum == checksumCode;
    }
}
