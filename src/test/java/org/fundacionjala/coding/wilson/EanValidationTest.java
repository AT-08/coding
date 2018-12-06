package org.fundacionjala.coding.wilson;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 *
 */
public class EanValidationTest {
    private EanValidation eanValidator;

    /**
     *
     *
     */

    @Before
    public void setUp() {
        eanValidator = new EanValidation();

    }

    /**
     *
     *
     */
    @Test
    public void testTrue1() {
        assertTrue(eanValidator.validate("9783815820865"));
    }
    /**
     *
     *
     */
    @Test
    public void testFalse() {
        assertFalse(eanValidator.validate("9783815820864"));
    }
    /**
     *
     *
     */
    @Test
    public void testTrue2() {
        assertTrue(eanValidator.validate("9783827317100"));
    }
}
