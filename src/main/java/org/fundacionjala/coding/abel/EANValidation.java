package org.fundacionjala.coding.abel;

/**
 *
 */
public class EANValidation {
    private static final int DOS = 2;
    private static final int DIEZ = 10;
    private static final int TRES = 3;
    private static final int UNO = 1;

    /**
     * @param eanCode input strigsdfsdfsdf
     * @return values of return
     */
    public boolean validate(final String eanCode) {
        String[] auxiliar = eanCode.split("");
        int sum = 0;
        for (int i = 0; i <= auxiliar.length - DOS; i++) {
            int num = Integer.parseInt(auxiliar[i]);
            sum += i % DOS == 0 ? num : num * TRES;
        }
        sum = sum % DIEZ == 0 ? 0 : DIEZ - (sum % DIEZ);

        return sum == Integer.parseInt(auxiliar[auxiliar.length - UNO]);

    }
}
