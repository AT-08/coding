package org.fundacionjala.coding.wilson;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 */
public class DnaTest {

    /**
     *
     */
    @Test
    public void test00() {
        assertEquals("TTTT", Dna.makeComplement("AAAA"));
    }
    /**
     * Test complementary AAAA string dna.
     */
    @Test
    public void test01() {
        assertEquals("TTTT", Dna.makeComplement("AAAA"));
    }

    /**
     * Test complementary ATTGC string dna.
     */
    @Test
    public void test02() {
        assertEquals("TAACG", Dna.makeComplement("ATTGC"));
    }

    /**
     * Test complementary GTAT string dna.
     */
    @Test
    public void test03() {
        assertEquals("CATA", Dna.makeComplement("GTAT"));
    }
}
