package org.fundacionjala.coding.wilson;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * */
public class SortTheInnerContentTest {

    /**
     *
     */
    @Test
    public void exampleTests() {
        assertEquals("srot the inner ctonnet", SortTheInnerContent.sortTheInnerContent("sort the inner content"));
        assertEquals("wiat for me", SortTheInnerContent.sortTheInnerContent("wait for me"));
        assertEquals("tihs ktaa is esay", SortTheInnerContent.sortTheInnerContent("this kata is easy"));
    }
}
