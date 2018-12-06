package org.fundacionjala.coding.rodrigo;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for DNA.
 */
public class DnaStrandTest {
    /**
     * Test 1.
     */
    @Test
    public void test01() {
        assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
    }

    /**
     * Test 2.
     */
    @Test
    public void test02() {
        assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    }

    /**
     * Test 3.
     */
    @Test
    public void test03() {
        assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
    }

    /**
     * Test 4.
     */
    @Test
    public void test04() {
        assertEquals("TTCC", DnaStrand.makeComplement("AAGG"));
    }

    /**
     * Test 5.
     */
    @Test
    public void test05() {
        assertEquals("GCGC", DnaStrand.makeComplement("CGCG"));
    }

    /**
     * Test 6.
     */
    @Test
    public void test06() {
        assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    }

    /**
     * Test 7.
     */
    @Test
    public void test07() {
        assertEquals("CATAGCTAGCTAGCTAGCTAATATAAAAGCTGCTCTAAATTTATATATATATATGCTCTCTTATGTCTATCTGTCTAAT",
                DnaStrand.makeComplement(
                        "GTATCGATCGATCGATCGATTATATTTTCGACGAGATTTAAATATATATATATACGAGAGAATACAGATAGACAGATTA"));
    }
}
