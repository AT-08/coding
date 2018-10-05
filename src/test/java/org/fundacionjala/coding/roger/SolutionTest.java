package org.fundacionjala.coding.roger;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit Tests.
 *
 */

public class SolutionTest {

    /**
     * Unit Test testTwoWords.
     *
     */

    @Test
    public void testTwoWords() {
        assertEquals("OneTwo", Solution.camelCase("one two"));
    }

    /**
     * Unit Test testThreeWords.
     *
     */

    @Test
    public void testThreeWords() {
        assertEquals("CamelCaseMethod", Solution.camelCase("camel case method"));
    }

    /**
     * Unit Test testLeadingSpace.
     *
     */

    @Test
    public void testLeadingSpace() {
        assertEquals("CamelCaseWord", Solution.camelCase(" camel case word"));
    }

    /**
     * Unit Test testTrailingSpace.
     *
     */

    @Test
    public void testTrailingSpace() {
        assertEquals("HiStudents", Solution.camelCase("hi students "));
    }

    /**
     * Unit Test testSingleLetter.
     *
     */

    @Test
    public void testSingleLetter() {
        assertEquals("Z", Solution.camelCase("z"));
        assertEquals("A", Solution.camelCase("a"));
    }

    /**
     * Unit Test testTwoSpacesBetweenWords.
     *
     */

    @Test
    public void testTwoSpacesBetweenWords() {
        assertEquals("AbC", Solution.camelCase("ab  c"));
    }

    /**
     * Unit Test testThreeSpacesBetweenWords.
     *
     */

    @Test
    public void testThreeSpacesBetweenWords() {
        assertEquals("ThreeTwo", Solution.camelCase("three   Two"));
    }

    /**
     * Unit Test testEmptyString.
     *
     */

    @Test
    public void testEmptyString() {
        assertEquals("", Solution.camelCase(""));
    }

    /**
     * Unit Test testSpaceInAll.
     *
     */

    @Test
    public void testSpaceInAll() {
        assertEquals("OneTwoThreeFor", Solution.camelCase(" one  two three for "));
    }

    /**
     * Unit Test testUpperCase.
     *
     */

    @Test
    public void testUpperCase() {
        assertEquals("OneTwoThreeFor", Solution.camelCase(" one  Two three For "));
    }

}
