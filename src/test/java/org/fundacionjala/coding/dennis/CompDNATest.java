package org.fundacionjala.coding.dennis;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 */
public class CompDNATest {

    /**
     *
     */
    @Test
    public void testCompDna1() {
        assertEquals("TTTT", CompDNA.cDna("AAAA"));
    }

    /**
     *
     */
    @Test
    public void testCompDna2() {
        assertEquals("TAACG", CompDNA.cDna("ATTGC"));
    }

    /**
     *
     */
    @Test
    public void testCompDna3() {
        assertEquals("CATA", CompDNA.cDna("GTAT"));
    }
}
