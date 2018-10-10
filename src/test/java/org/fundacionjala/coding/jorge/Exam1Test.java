package org.fundacionjala.coding.jorge;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 */
public class Exam1Test {
    /**
     *
     */
    @Test
    public void test1() {
        assertTrue(Exam1.validate("9783815820865"));
    }
    /**
     *
     */
    @Test
    public void test2() {
        assertFalse(Exam1.validate("9783815820864"));
    }
    /**
     *
     */
    @Test
    public void test3() {
        assertTrue(Exam1.validate("9783827317100"));
    }
}
