package org.fundacionjala.coding.abel;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 *
 */
public class DnaComplementaryTest {
    /**
     *
     */
    @Test
    public void test01() {
        assertEquals("TTTT", DnaComplementary.makeComplement("AAAA"));
    }

    /**
     *
     */
    @Test
    public void test02() {
        assertEquals("TAACG", DnaComplementary.makeComplement("ATTGC"));
    }

    /**
     *
     */
    @Test
    public void test03() {
        assertEquals("CATA", DnaComplementary.makeComplement("GTAT"));
    }

    /**
     *
     */
    @Test
    public void test04() {
        assertEquals("CATHGA", DnaComplementary.makeComplement("GTAHCT"));
    }

    /**
     *
     */
    @Test
    public void test05() {
        assertEquals("", DnaComplementary.makeComplement(""));
    }

    /**
     *
     */
    @Test
    public void test06() {
        assertEquals("898989", DnaComplementary.makeComplement("898989"));
    }


}
