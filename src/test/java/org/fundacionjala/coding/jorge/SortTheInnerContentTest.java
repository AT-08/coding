package org.fundacionjala.coding.jorge;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Sort  content Test Class.
 */
public class SortTheInnerContentTest {

    /**
     * Test to main method.
     */
    @Test
    public void sortTheInnerContentTest1() {
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr",
                SortTheInnerContent.sortTheContent("sort the inner content in descending order"));
    }

    /**
     * Test to main method.
     */
    @Test
    public void sortTheInnerContentTest2() {
        assertEquals("wiat for me", SortTheInnerContent.sortTheContent("wait for me"));
    }

    /**
     * Test to main method.
     */
    @Test
    public void sortTheInnerContentTest3() {
        assertEquals("tihs ktaa is esay", SortTheInnerContent.sortTheContent("this kata is easy"));
    }
}
