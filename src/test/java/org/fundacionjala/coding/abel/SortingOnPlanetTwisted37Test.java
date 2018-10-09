package org.fundacionjala.coding.abel;

import static org.junit.Assert.assertArrayEquals;


import org.junit.Before;
import org.junit.Test;

/**
 *
 */
public class SortingOnPlanetTwisted37Test {

    private SortingOnPlanetTwisted37 c;

    /**
     *
     */
    @Before
    public void before() {
        c = new SortingOnPlanetTwisted37();
    }

    /**
     *
     */
    @Test
    public void basicTests1() {
        final Integer[] espectative = new Integer[]{1, 2, 7, 4, 5, 6, 3, 8, 9};
        final Integer[] actual = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(espectative, c.sortTwdd37(actual));
    }

    /**
     *
     */
    @Test
    public void basicTests2() {
        final Integer[] espectative = new Integer[]{12, 14, 13};
        final Integer[] actual = new Integer[]{12, 13, 14};
        assertArrayEquals(espectative, c.sortTwdd37(actual));
    }

    /**
     *
     */
    @Test
    public void basicTests3() {


        final Integer[] espectative = new Integer[]{2, 7, 4, 3, 9};
        final Integer[] actual = new Integer[]{9, 2, 4, 7, 3};
        assertArrayEquals(espectative, c.sortTwdd37(actual));
    }

}
