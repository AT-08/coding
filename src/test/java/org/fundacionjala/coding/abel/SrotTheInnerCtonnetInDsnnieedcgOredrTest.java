package org.fundacionjala.coding.abel;

import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class SrotTheInnerCtonnetInDsnnieedcgOredrTest {
    private SrotTheInnerCtonnetInDsnnieedcgOredr instance;

    /**
     *
     */
    @Before
    public void before() {
        instance = new SrotTheInnerCtonnetInDsnnieedcgOredr();

    }

    /**
     *
     */


    @Test
    public void testSortTheInnerContent() {
        assertEquals("ctonnet in dsnnieedcg", instance.sortTheInnerContent("content in descending"));
    }

    /**
     *
     */
    @Test
    public void testSortTheInnerContentMinorOf5() {
        assertEquals("wiat for me", instance.sortTheInnerContent("wait for me"));

    }

    /**
     *
     */
    @Test
    public void testSortTheInnerContentMinorOf4() {
        assertEquals("tihs ktaa is esay", instance.sortTheInnerContent("this kata is easy"));
    }
}
