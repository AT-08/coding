package org.fundacionjala.coding.nestor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Sort iner content Test Class.
 */
public class SortInnerContentTest {

  /**
   * Test to main method.
   */
  @Test
  public void sortTheInnerContentTest() {
    SortInnerContent sortInner = new SortInnerContent();
    assertEquals("srot the inner ctonnet in dsnnieedcg oredr",
        sortInner.sortTheInnerContent("sort the inner content in descending order"));
    assertEquals("wiat for me", sortInner.sortTheInnerContent("wait for me"));
    assertEquals("tihs ktaa is esay", sortInner.sortTheInnerContent("this kata is easy"));
  }
}
