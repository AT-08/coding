package org.fundacionjala.coding.wilson;


import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * @author wiltrouble
 */

public  class PlanetTwisted37Test {

    private PlanetTwisted37 p;
    /**
     *
     */
    @Before
    public void before() {
        p = new PlanetTwisted37();
    }

    /**
     *
     */
    @Test
    public void allTests() {
        final Integer[] n1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final Integer[] expected1 = {1, 2, 7, 4, 5, 6, 3, 8, 9};
        final Integer[] n2 = {9, 2, 4, 7, 3};
        final Integer[] expected2 = {2, 7, 4, 3, 9};
        final Integer[] n3 = {12, 13, 14};
        final Integer[] expected3 = {12, 14, 13};

        assertArrayEquals(expected1, p.sortTwisted37(n1));
        assertArrayEquals(expected2, p.sortTwisted37(n2));
        assertArrayEquals(expected3, p.sortTwisted37(n3));

    }
}
