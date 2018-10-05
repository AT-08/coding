package org.fundacionjala.coding.nestor;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Class to resolve Sorting on the planet twisted 3 7.
 */
public final class Kata {
  /**
   * For utility class.
   */
  private Kata() { }
  /**
   * Method to resolve sorting.
   * @param array type Integer.
   * @return an array sorted 3 7 tye Integer.
   */
  public static Integer[] sortTwisted37(final Integer[] array) {
    return Arrays.stream(array)
        .map(Kata::twistedNumber)
        .sorted(Comparator.naturalOrder())
        .map(Kata::twistedNumber)
        .toArray(Integer[]::new);
  }

  /**
   * Method to twist 3 for 7.
   * @param number type Integer.
   * @return number twisted.
   */
  public static Integer twistedNumber(final Integer number) {
    String twisted = String.valueOf(number)
        .replace('3', 'x')
        .replace('7', '3')
        .replace('x', '7');

    return Integer.parseInt(twisted);
  }
}
