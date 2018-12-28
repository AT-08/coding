package org.fundacionjala.coding.nestor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Test class Fizz Buzz.
 */
public class FizzBuzzTest {
  private static final String FZBZ = "FizzBuzz";
  private FizzBuzz fb;

  /**
   * Method Before setup.
   */
  @Before
  public void setup() {
    fb = new FizzBuzz();
  }

  /**
   * Method general testing.
   */
  @Test
  public void fizzBuzzTest() {
    final Integer[] counter = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    String[] expected = new String[]
        {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
            "11", "Fizz", "Fizz", "14", FZBZ, "16", "17", "Fizz", "19", "Buzz"};
    assertArrayEquals(expected, fb.fizzBuzz(counter));
  }

  /**
   * Method testing only Fizz.
   */
  @Test
  public void fizzBuzzTestWithOnlyFizz() {
    final Integer[] counter = new Integer[] {33, 39, 57};
    String[] expected = new String[] {"Fizz", "Fizz", "Buzz"};
    assertArrayEquals(expected, fb.fizzBuzz(counter));
  }

  /**
   * Testing only Buzz.
   */
  @Test
  public void fizzBuzzTestWithOnlyBuzz() {
    final Integer[] counter = new Integer[] {35, 40, 65};
    String[] expected = new String[] {"Buzz", "Buzz", "Buzz"};
    assertArrayEquals(expected, fb.fizzBuzz(counter));
  }

  /**
   * Testing only FizzBuzz.
   */
  @Test
  public void fizzBuzzTestWithOnlyFizzBuzz() {
    final Integer[] counter = new Integer[] {30, 60, 90};
    String[] expected = new String[] {FZBZ, FZBZ, FZBZ};
    assertArrayEquals(expected, fb.fizzBuzz(counter));
  }

  /**
   * Testing only numbers.
   */
  @Test
  public void fizzBuzzTestWithOnlyNumbers() {
    final Integer[] counter = new Integer[] {22, 83, 94};
    String[] expected = new String[] {"22", "Fizz", "94"};
    assertArrayEquals(expected, fb.fizzBuzz(counter));
  }
}
