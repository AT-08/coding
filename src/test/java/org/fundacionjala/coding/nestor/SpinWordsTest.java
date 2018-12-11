package org.fundacionjala.coding.nestor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To test spin words class.
 */
public class SpinWordsTest {
  private SpinWords sw;

  /**
   * Before Testing instantiated class SpinWords.
   */
  @Before
  public void setup() {
    sw = new SpinWords();
  }
  /**
   * Testing spin words method.
   */
  @Test
  public void spinWords() {
    assertEquals("emocleW", sw.spinWords("Welcome"));
    assertEquals("Hey wollef sroirraw", sw.spinWords("Hey fellow warriors"));
  }
}
