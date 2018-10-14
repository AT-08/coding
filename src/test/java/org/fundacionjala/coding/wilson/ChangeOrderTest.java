package org.fundacionjala.coding.wilson;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * */
public class ChangeOrderTest {

    /**
     *
     */
    @Test
    public void exampleTests() {
        assertEquals("srot the inner ctonnet", ChangeOrder.sortTheInnerContent("sort the inner content"));
        assertEquals("wiat for me", ChangeOrder.sortTheInnerContent("wait for me"));
        assertEquals("tihs ktaa is esay", ChangeOrder.sortTheInnerContent("this kata is easy"));
    }
}
