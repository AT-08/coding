package org.fundacionjala.coding.nestor;

/**
 * Class to resolve Kata EAN Validation.
 */
public class EanValidation {
  private static final int TEN = 10;
  private static final int THREE = 3;
  private static final int TWO = 2;

  /**
   * Method to return true if a code string is a ean valid code.
   * @param eanCode type string.
   * @return true or false.
   */
  public boolean validate(final String eanCode) {
    Long number = Long.parseLong(eanCode.substring(0, eanCode.length() - 1));
    int counter = 0;
    int total = 0;
    while (counter < eanCode.length()) {
      total += counter % TWO == 0 ? number % TEN * THREE : number % TEN * 1;
      number /= TEN;
      counter++;
    }
    int checksum = total % TEN == 0 ? 0 : TEN - (total % TEN);
    return checksum == Character.getNumericValue(eanCode.charAt(eanCode.length() - 1));
  }

}
