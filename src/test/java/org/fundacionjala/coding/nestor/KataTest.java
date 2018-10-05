package org.fundacionjala.coding.nestor;

import org.junit.Test;

import java.util.Arrays;
import static org.junit.Assert.assertEquals;

/**
 * To test class Kata.
 */
public class KataTest {
  /**
   * Method basic test.
   */
  @Test
  public void sortTwisted37() {
    final Integer[] expectedResult1 = new Integer[] {1, 2, 7, 4, 5, 6, 3, 8, 9};
    final Integer[] expectedResult2 = new Integer[] {12, 14, 13};
    final Integer[] expectedResult3 = new Integer[] {2, 7, 4, 3, 9};
    final Integer[] actualValue1 = new Integer[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
    final Integer[] actualValue2 = new Integer[] {12, 13, 14};
    final Integer[] actualValue3 = new Integer[] {9, 2, 4, 7, 3};

    assertEquals(Arrays.toString(expectedResult1), Arrays.toString(Kata.sortTwisted37(actualValue1)));
    assertEquals(Arrays.toString(expectedResult2), Arrays.toString(Kata.sortTwisted37(actualValue2)));
    assertEquals(Arrays.toString(expectedResult3), Arrays.toString(Kata.sortTwisted37(actualValue3)));
  }
}
