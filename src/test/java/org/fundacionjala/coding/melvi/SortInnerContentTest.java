package org.fundacionjala.coding.melvi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
    public class SortInnerContentTest {
    /**
     * test.
     * */
    @Test
        public void testKataSentence() {
            assertEquals("srot the inner ctonnet in dsnnieedcg oredr",
             SortInnerContent.sortTheInnerContent("sort the inner content in descending order"));

        }

    /**
     * test.
     * */
    @Test
    public void testKataThreeWords() {

        assertEquals("wiat for me", SortInnerContent.sortTheInnerContent("wait for me"));

    }

    /**
     * test.
     * */
    @Test
    public void testKataFourWords() {

        assertEquals("tihs ktaa is esay", SortInnerContent.sortTheInnerContent("this kata is easy"));
    }
    }
