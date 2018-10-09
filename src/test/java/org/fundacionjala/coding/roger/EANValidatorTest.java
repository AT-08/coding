package org.fundacionjala.coding.roger;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unit Tests.
 *
 */

public class EANValidatorTest {

    private EANValidator eanValidator;

    /**
     * SETUP.
     *
     */

    @Before
    public void setUp() {
        eanValidator = new EANValidator();

    }

    /**
     * Unit Test 1 TRUE.
     *
     */
    @Test
    public void test1() {
        assertTrue(eanValidator.validate("9783815820865"));
    }
    /**
     * Unit Test 2 FALSE.
     *
     */
    @Test
    public void test2() {
        assertFalse(eanValidator.validate("9783815820864"));
    }
    /**
     * Unit Test 3 TRUE.
     *
     */
    @Test
    public void test3() {
        assertTrue(eanValidator.validate("9783827317100"));
    }
}
