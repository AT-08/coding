package org.fundacionjala.coding.abel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 *
 */
public class EANValidationTest {

    private EANValidation instance;

    /**
     *
     */
    @Before
    public void before() {
        instance = new EANValidation();
    }

    /**
     *
     */
    @Test
    public void test01() {
        assertTrue(instance.validate("9783815820865"));
    }

    /**
     *
     */
    @Test
    public void test02() {
        assertFalse(instance.validate("9783815820864"));
    }

    /**
     *
     */
    @Test
    public void test03() {
        assertTrue(instance.validate("9783827317100"));
    }
}
