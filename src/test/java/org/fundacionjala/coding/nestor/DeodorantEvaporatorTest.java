package org.fundacionjala.coding.nestor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To verify Deodorant Evaporator Class.
 */
public class DeodorantEvaporatorTest {
  private DeodorantEvaporator de;

  /**
   * Method to initialize class.
   */
  @Before
  public void setup() {
    de = new DeodorantEvaporator();
  }

  /**
   * Simple test evaporator method.
   */
  @Test
  public void testEvaporatorOne() {
    final int expectedResult = 22;
    final int ten = 10;
    assertEquals(expectedResult, de.evaporator(ten, ten, ten));
  }
}
