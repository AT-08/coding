package org.fundacionjala.coding.melvi;
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
        public void testDnaStrandA() {
            assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
        }

    /**
     *
     */
    @Test
        public void testDnaStrandB() {
            assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
        }

    /**
     *
     */
    @Test
        public void testDnaStrandC() {
            assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
        }
    }

