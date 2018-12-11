package org.fundacionjala.coding.nestor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link Vowels}.
 */
public class VowelsTest {
  static final int EXPECTED_FIVE = 5;

  /**
   * Verify if getCount return count vowel in given string.
   */
  @Test
  public void getCount() {
    Vowels testVowel = new Vowels();
    assertEquals("Nope!", EXPECTED_FIVE, testVowel.getCount("abracadabra"));
  }
}
