package org.fundacionjala.coding.rodrigo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Test for the final exam.
 */
public class EanValidationTest {
    private EanValidation eanValidation;

    /**
     * Setting the test.
     */
    @Before
    public void setUp() {
        eanValidation = new EanValidation();
    }

    /**
     * Test 1.
     */
    @Test
    public void test1() {
        assertTrue("Check EAN-Code \"9783815820865\"", eanValidation.validate("9783815820865"));
    }

    /**
     * Test 2.
     */
    @Test
    public void test2() {
        assertFalse("Check EAN-Code \"9783815820864\"", eanValidation.validate("9783815820864"));
    }

    /**
     * Test 3.
     */
    @Test
    public void test3() {
        assertTrue("Check EAN-Code \"9783827317100\"", eanValidation.validate("9783827317100"));
    }

    /**
     * Test 4.
     */
    @Test
    public void test4() {
        assertTrue("Check EAN-Code \"4003301018398\"", eanValidation.validate("4003301018398"));
    }

    /**
     * Test 5.
     */
    @Test
    public void test5() {
        assertFalse("Check EAN-Code \"9783827317101\"", eanValidation.validate("9783827317101"));
    }

    /**
     * Test 6.
     */
    @Test
    public void test6() {
        assertFalse("Check EAN-Code \"4003301018392\"", eanValidation.validate("4003301018392"));
    }

    /**
     * Test 7.
     */
    @Test
    public void test7() {
        assertTrue("Check EAN-Code \"0000000000017\"", eanValidation.validate("0000000000017"));
    }

    /**
     * Test 8.
     */
    @Test
    public void test8() {
        assertFalse("Check EAN-Code \"0000000000010\"", eanValidation.validate("0000000000010"));
    }
}
