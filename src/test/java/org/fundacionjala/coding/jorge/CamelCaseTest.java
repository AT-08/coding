package org.fundacionjala.coding.jorge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test Camel Case.
 */
public class CamelCaseTest {
    /**
     * Test case1.
     */

    /**
     * Test case1.
     */
    @Test
    public void testCase1() {
        final String expectedResult = "TestCase";
        assertEquals(expectedResult, CamelCase.camelCase("test case"));
    }

    /**
     * Test case1.
     */
    @Test
    public void testCase2() {
        final String expectedResult = "CamelCaseMethod";
        assertEquals(expectedResult, CamelCase.camelCase("camel case method"));
    }

    /**
     * Test case1.
     */
    @Test
    public void testCase3() {
        final String expectedResult = "SayHello";
        assertEquals(expectedResult, CamelCase.camelCase("say hello "));
    }

    /**
     * Test case1.
     */
    @Test
    public void testCase4() {
        final String expectedResult = "CamelCaseWord";
        assertEquals(expectedResult, CamelCase.camelCase(" camel case word"));
    }

    /**
     * Test case1.
     */
    @Test
    public void testCase5() {
        final String expectedResult = "";
        assertEquals(expectedResult, CamelCase.camelCase(""));
    }
}
