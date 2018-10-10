package org.fundacionjala.coding.nestor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * To verify EanValidation Class.
 */
public class EanValidationTest {
  private EanValidation ev;

  /**
   * Method setup before testing.
   */
  @Before
  public void setup() {
    ev = new EanValidation();
  }

  /**
   * Simple test to verify is code return true.
   */
  @Test
  public void test01() {
    assertTrue(ev.validate("9783815820865"));
  }

  /**
   * Simple test to verify is code return false.
   */
  @Test
  public void test02() {
    assertFalse(ev.validate("9783815820864"));
  }

  /**
   * Simple test to verify is code return true.
   */
  @Test
  public void test03() {
    assertTrue(ev.validate("9783827317100"));
  }

}
