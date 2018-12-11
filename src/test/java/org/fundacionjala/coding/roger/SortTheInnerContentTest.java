package org.fundacionjala.coding.roger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit Tests.
 *
 */

public class SortTheInnerContentTest {

    /**
     * Unit test example test.
     *
     */

    @Test
    public void exampleTests() {
        assertEquals("srot the inner ctonnet in dsnnieedcg oredr", SortTheInnerContent
                .sortTheInnerContent("sort the inner content in descending order"));
        assertEquals("wiat for me", SortTheInnerContent.sortTheInnerContent("wait for me"));
        assertEquals("tihs ktaa is esay", SortTheInnerContent.sortTheInnerContent("this kata is easy"));
    }

    /**
     * Unit test uppercase sentence.
     *
     */

    @Test
    public void testsToUpperCase() {
        assertEquals("WIAT FOR ME", SortTheInnerContent.sortTheInnerContent("WAIT FOR ME"));
        assertEquals("TIHS KTAA IS ESAY", SortTheInnerContent.sortTheInnerContent("THIS KATA IS EASY"));
    }
}
