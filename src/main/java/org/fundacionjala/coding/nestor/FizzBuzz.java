package org.fundacionjala.coding.nestor;

import java.util.Arrays;

/**
 * Class Fizz Buzz.
 */
public class FizzBuzz {
  /**
   * Method to transform numbers % 3 and numbers % 5.
   *
   * @param counter type Array of Integer.
   * @return type Array of String.
   */
  public String[] fizzBuzz(final Integer[] counter) {
    return Arrays.stream(counter)
        .map(FizzBuzz::verify)
        .toArray(String[]::new);
  }

  /**
   * Method to verify if number is multiply of three, five or both them.
   *
   * @param number type integer.
   * @return string with the result.
   */
  public static String verify(int number) {
    final String fb = "FizzBuzz";
    final String fz = "Fizz";
    final String bz = "Buzz";
    final int five = 5;
    final int three = 3;
    if (number % five == 0 && number % three == 0) {
      return fb;
    }
    String strNumber = String.valueOf(number);
    if (number % five == 0 || strNumber.contains("5")) {
      return bz;
    }
    return number % three == 0 || strNumber.contains("3") ? fz : strNumber;
  }
}
