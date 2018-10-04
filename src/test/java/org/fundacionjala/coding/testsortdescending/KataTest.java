package org.fundacionjala.coding.testsortdescending;

import org.fundacionjala.coding.sortdescending.Kata;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Test about the Kata.
 */
public class KataTest {
    /**
     * Test randomly.
     */
    @Test
    public void sortTheInnerContent() {
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr",
                Kata.sortTheInnerContent("sort the inner content in descending order"));
        assertEquals("wiat for me", Kata.sortTheInnerContent("wait for me"));
        assertEquals("tihs ktaa is esay", Kata.sortTheInnerContent("this kata is easy"));
        assertEquals("I am", Kata.sortTheInnerContent("I am"));
    }

    /**
     * Test extracted of codewars.
     */
    @Test
    public void sortString() {
        assertEquals("zyxwvutsrqponmlkjihgfedcbaz",
                Kata.sortTheInnerContent("zbcdefghijklmnopaqrstuvwxyz"));
    }
}
