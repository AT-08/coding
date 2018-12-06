package org.fundacionjala.coding.nestor;

import java.util.Arrays;

/**
 * Class to resolve kata highest and lowest number.
 */
public class HighestLowest {
  private static final String SPACE = " ";
  /**
   * Method to return an string with highest and lowest numbers.
   * @param numbers Type String.
   * @return string with de highest and lowest numbers.
   */
  public String highAndLow(final String numbers) {
    Integer[] result = Arrays.stream(numbers.split(SPACE))
        .map(Integer::parseInt)
        .sorted()
        .toArray(Integer[]::new);
    return String.format("%d %d", result[result.length - 1], result[0]);
  }
}
