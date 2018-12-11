package org.fundacionjala.coding.melvi;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 */
public class EANValidatorTest {
    /**
     *
     */
    @Test

    public void testValidate01() {

        assertTrue(EANValidator.validate("9783815820865"));
    }

    /**
     *
     */
    @Test

    public void testValidate02() {

        assertFalse(EANValidator.validate("9783815820864"));
    }

    /**
     *
     */
    @Test
    public void testValidate03() {

        assertTrue(EANValidator.validate("9783827317100"));
    }
}





