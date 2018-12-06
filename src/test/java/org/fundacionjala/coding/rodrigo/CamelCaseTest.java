package org.fundacionjala.coding.rodrigo;


        import org.junit.Test;

        import static org.junit.Assert.assertEquals;

/**
 * Test for rodrigo.
 */
public class CamelCaseTest {
    /**
     * Test 1.
     */
    @Test
    public void testTwoWords() {
        assertEquals("TestCase", CamelCase.toCC("test case"));
    }

    /**
     * Test 2.
     */
    @Test
    public void testThreeWords() {
        assertEquals("CamelCaseMethod", CamelCase.toCC("camel case method"));
    }

    /**
     * Test 3.
     */
    @Test
    public void testLeadingSpace() {
        assertEquals("CamelCaseWord", CamelCase.toCC(" camel case word"));
    }

    /**
     * Test 4.
     */
    @Test
    public void testTrailingSpace() {
        assertEquals("SayHello", CamelCase.toCC("say hello "));
    }

    /**
     * Test 5.
     */
    @Test
    public void testSingleLetter() {
        assertEquals("Z", CamelCase.toCC("z"));
    }

    /**
     * Test 6.
     */
    @Test
    public void testTwoSpacesBetweenWords() {
        assertEquals("AbC", CamelCase.toCC("ab  c"));
    }

    /**
     * Test 7.
     */
    @Test
    public void testEmptyString() {
        assertEquals("", CamelCase.toCC(""));
    }

    /**
     * Test 8.
     */
    @Test
    public void testSingleString() {
        assertEquals("X", CamelCase.toCC("x"));
    }

}
