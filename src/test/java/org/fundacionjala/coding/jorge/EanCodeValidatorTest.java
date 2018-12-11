package org.fundacionjala.coding.jorge;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 */
public class EanCodeValidatorTest {
    /**
     *
     */
    @Test
    public void test1() {
        assertTrue(EanCodeValidator.validate("9783815820865"));
    }
    /**
     *
     */
    @Test
    public void test2() {
        assertFalse(EanCodeValidator.validate("9783815820864"));
    }
    /**
     *
     */
    @Test
    public void test3() {
        assertTrue(EanCodeValidator.validate("9783827317100"));
    }
}
