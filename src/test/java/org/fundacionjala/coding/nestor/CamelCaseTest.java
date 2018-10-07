package org.fundacionjala.coding.nestor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link CamelCase}.
 */
public class CamelCaseTest {
  private CamelCase solution;

  /**
   * Before testing instantiate Camel Case class.
   */
  @Before
  public void setup() {
    solution = new CamelCase();
  }

  /**
   * Verify if two words can be converted to TwoWord.
   */
  @Test
  public void testTwoWords() {
    assertEquals("TestCase", solution.camelCase("test case"));
  }

  /**
   * Verify if three word can be converted to ThreeWordCan.
   */
  @Test
  public void testThreeWords() {
    assertEquals("CamelCaseMethod", solution.camelCase("camel case method"));
  }

  /**
   * Verify if " leading space" can be converted to LeadingSpace.
   */
  @Test
  public void testLeadingSpace() {
    assertEquals("CamelCaseWord", solution.camelCase(" camel case word"));
  }

  /**
   * Verify if "trailing space " can be converted to TrailingSpace.
   */
  @Test
  public void testTrailingSpace() {
    assertEquals("SayHello", solution.camelCase("say hello "));
  }

  /**
   * Verify if single "z" letter can be converted to "Z".
   */
  @Test
  public void testSingleLetter() {
    assertEquals("Z", solution.camelCase("z"));
  }

  /**
   * Verify if "Two  spaces between  words" can be converted to TwoSpacesBetweenWords.
   */
  @Test
  public void testTwoSpacesBetweenWords() {
    assertEquals("AbC", solution.camelCase("ab  c"));
  }

  /**
   * Verify if empty string is assert.
   */
  @Test
  public void testEmptyString() {
    assertEquals("", solution.camelCase(""));
  }
}
