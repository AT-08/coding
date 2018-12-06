package org.fundacionjala.coding.abel;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class CamelCaseTest {
    private CamelCase c;

    /**
     *
     */
    @Before
    public void before() {
        c = new CamelCase();
    }

    /**
     *
     */
    @Test
    public void testTwoWords() {

        assertEquals("TestCase", c.camelCase("test case"));
    }

    /**
     *
     */
    @Test
    public void testThreeWords() {
        assertEquals("CamelCaseMethod", c.camelCase("camel case method"));
    }

    /**
     *
     */
    @Test
    public void testLeadingSpace() {
        assertEquals("CamelCaseWord", c.camelCase(" camel case word"));
    }

    /**
     *
     */
    @Test
    public void testTrailingSpace() {
        assertEquals("SayHello", c.camelCase("say hello "));
    }

    /**
     *
     */
    @Test
    public void testSingleLetter() {
        assertEquals("Z", c.camelCase("z"));
    }

    /**
     *
     */
    @Test
    public void testTwoSpacesBetweenWords() {
        assertEquals("AbC", c.camelCase("ab  c"));
    }

    /**
     *
     */
    @Test
    public void testEmptyString() {
        assertEquals("", c.camelCase(""));
    }


}
