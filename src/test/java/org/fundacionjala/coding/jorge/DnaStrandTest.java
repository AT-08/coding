package org.fundacionjala.coding.jorge;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 */
public class DnaStrandTest {

    /**
     *
     */
    @Test
    public void test1() {
        assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
    }

    /**
     *
     */
    @Test
    public void test2() {
        assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    }

    /**
     *
     */
    @Test
    public void test3() {
        assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
    }
}
