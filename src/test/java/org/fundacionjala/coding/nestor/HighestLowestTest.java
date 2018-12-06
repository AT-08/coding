package org.fundacionjala.coding.nestor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To test Highest Lowest Class.
 */
public class HighestLowestTest {
  private HighestLowest hl;
  /**
   * Setup to initialize Class to test.
   */
  @Before
  public void setup() {
    hl = new HighestLowest();
  }

  /**
   * Method with simple High and Low test.
   */
  @Test
  public void highAndLow() {
    assertEquals("42 -9", hl.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
  }
}
