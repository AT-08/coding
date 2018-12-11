package org.fundacionjala.coding.jorge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To test spin words class.
 */
public class SpinWordsTest {
    /**
     * Testing spin words 1.
     */
    @Test
    public void test1() {
        assertEquals("emocleW", SpinWords.spinWords("Welcome"));
    }
    /**
     * Testing spin words 2.
     */
    @Test
    public void test2() {
        assertEquals("Hey wollef sroirraw", SpinWords.spinWords("Hey fellow warriors"));
    }
}

