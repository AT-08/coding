package org.fundacionjala.coding.roger;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit Tests.
 * Kata 6
 *
 */

public class DnaStrandTest {

    /**
     * Unit Test 01.
     *
     */

    @Test
    public void test01() {
        assertEquals("TTTT", DnaStrand.makeComplement("AAAA"));
    }

    /**
     * Unit Test 02.
     *
     */

    @Test
    public void test02() {
        assertEquals("TAACG", DnaStrand.makeComplement("ATTGC"));
    }

    /**
     * Unit Test 03.
     *
     */

    @Test
    public void test03() {
        assertEquals("CATA", DnaStrand.makeComplement("GTAT"));
    }
}
