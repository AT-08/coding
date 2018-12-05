package org.fundacionjala.coding.nestor;

public final class SortTheOdd {
  public static int[] sortArray(final int[] array) {
    if (array.length > 0) {
      for (int i = 0; i < array.length; i++) {
        if (array[i] % 2 > 0) {
          sortNextOdd(i, array);
        }
      }
      return array;
    }
    return array;
  }
  
  public static int[] sortNextOdd(final int p, final int[] array) {
    for (int i = array.length - 1; i > p; i--) {
      if (array[i] % 2 > 0) {
        if (array[p] > array[i]) {
          int x = array[i];
          array[i] = array[p];
          array[p] = x;
          return array;
        }
      }
    }
    return array;
  }
}