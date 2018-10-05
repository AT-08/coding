package org.fundacionjala.coding.nestor;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * To test for {@link DnaStrand}.
 */
public class DnaStrandTest {
  private DnaStrand dna;

  /**
   * Setup before test.
   */
  @Before
  public void setup() {
    dna = new DnaStrand();
  }


  /**
   * Test complementary AAAA string dna.
   */
  @Test
  public void test01() {
    assertEquals("TTTT", dna.makeComplement("AAAA"));
  }

  /**
   * Test complementary ATTGC string dna.
   */
  @Test
  public void test02() {
    assertEquals("TAACG", dna.makeComplement("ATTGC"));
  }

  /**
   * Test complementary GTAT string dna.
   */
  @Test
  public void test03() {
    assertEquals("CATA", dna.makeComplement("GTAT"));
  }
}
