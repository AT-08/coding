package org.fundacionjala.coding.roger;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit Tests.
 *
 */

public class CamelCaseTest {

    /**
     * Unit Test testTwoWords.
     *
     */

    @Test
    public void testTwoWords() {
        assertEquals("OneTwo", CamelCase.camelCase("one two"));
    }

    /**
     * Unit Test testThreeWords.
     *
     */

    @Test
    public void testThreeWords() {
        assertEquals("CamelCaseMethod", CamelCase.camelCase("camel case method"));
    }

    /**
     * Unit Test testLeadingSpace.
     *
     */

    @Test
    public void testLeadingSpace() {
        assertEquals("CamelCaseWord", CamelCase.camelCase(" camel case word"));
    }

    /**
     * Unit Test testTrailingSpace.
     *
     */

    @Test
    public void testTrailingSpace() {
        assertEquals("HiStudents", CamelCase.camelCase("hi students "));
    }

    /**
     * Unit Test testSingleLetter.
     *
     */

    @Test
    public void testSingleLetter() {
        assertEquals("Z", CamelCase.camelCase("z"));
        assertEquals("A", CamelCase.camelCase("a"));
    }

    /**
     * Unit Test testTwoSpacesBetweenWords.
     *
     */

    @Test
    public void testTwoSpacesBetweenWords() {
        assertEquals("AbC", CamelCase.camelCase("ab  c"));
    }

    /**
     * Unit Test testThreeSpacesBetweenWords.
     *
     */

    @Test
    public void testThreeSpacesBetweenWords() {
        assertEquals("ThreeTwo", CamelCase.camelCase("three   Two"));
    }

    /**
     * Unit Test testEmptyString.
     *
     */

    @Test
    public void testEmptyString() {
        assertEquals("", CamelCase.camelCase(""));
    }

    /**
     * Unit Test testSpaceInAll.
     *
     */

    @Test
    public void testSpaceInAll() {
        assertEquals("OneTwoThreeFor", CamelCase.camelCase(" one  two three for "));
    }

    /**
     * Unit Test testUpperCase.
     *
     */

    @Test
    public void testUpperCase() {
        assertEquals("OneTwoThreeFor", CamelCase.camelCase(" one  Two three For "));
    }

}
