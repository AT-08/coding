package org.fundacionjala.coding.wilson;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class SolutionTest {

    /**
     *
     */
    @Test
    public void testBasic() {
        final int expectedResult = 274;
        final int expectedResult2 = 5311;
        final int expectedResult3 = 86320;
        final int expectedResult4 = 974302;
        assertEquals("2-7-4", Solution.dashatize(expectedResult));
        assertEquals("5-3-1-1", Solution.dashatize(expectedResult2));
        assertEquals("86-3-20", Solution.dashatize(expectedResult3));
        assertEquals("9-7-4-3-02", Solution.dashatize(expectedResult4));
    }

    /**
     *
     */
    @Test
    public void testWeird() {
        final int expectedResult = -28369;
        assertEquals("0", Solution.dashatize(0));
        assertEquals("1", Solution.dashatize(-1));
        assertEquals("28-3-6-9", Solution.dashatize(-expectedResult));
    }

    /**
     *
     */
    @Test
    public void testEdgeCases() {
        final int expectedResult = -1111111111;
        assertEquals("2-1-4-7-48-3-64-7", Solution.dashatize(Integer.MAX_VALUE));
        assertEquals("2-1-4-7-48-3-648", Solution.dashatize(Integer.MIN_VALUE));
        assertEquals("1-1-1-1-1-1-1-1-1-1", Solution.dashatize(expectedResult));
    }
}
