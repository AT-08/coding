package org.fundacionjala.coding.rodrigo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test about the Kata.
 */
public class SortInnerContentTest {
    /**
     * Test randomly.
     */
    @Test
    public void sortTheInnerContent() {
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr",
                SortInnerContent.sortTheInnerContent("sort the inner content in descending order"));
        assertEquals("wiat for me", SortInnerContent.sortTheInnerContent("wait for me"));
        assertEquals("tihs ktaa is esay", SortInnerContent.sortTheInnerContent("this kata is easy"));
        assertEquals("I am", SortInnerContent.sortTheInnerContent("I am"));
    }

    /**
     * Test extracted of codewars.
     */
    @Test
    public void sortString() {
        assertEquals("zyxwvutsrqponmlkjihgfedcbaz",
                SortInnerContent.sortTheInnerContent("zbcdefghijklmnopaqrstuvwxyz"));
    }
}
