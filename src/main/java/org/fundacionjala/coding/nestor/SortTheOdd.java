package org.fundacionjala.coding.nestor;


import java.util.Arrays;

/**
 * Class in order to sort only odd numbers from integer array.
 * https://www.codewars.com/kata/sort-the-odd/train/java
 */

public class SortTheOdd {

  /**
   * Method to sort ascending odd numbers but even numbers must be on their places.
   *
   * @param array to integers.
   * @return same array with odd elements sorted.
   */
  public int[] sortArray(final int[] array) {
    int[] f = Arrays.stream(array).filter(n -> n % 2 > 0).sorted().toArray();
    int oddPointer = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 > 0) {
        array[i] = f[oddPointer++];
      }
    }
    return array;
  }
}
