package org.fundacionjala.coding.rodrigo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Test for SortPlanet.
 */
public class SortingPlanetTest {
    private SortingPlanet sortingPlanet;

    /**
     * Setting the class.
     */
    @Before
    public void setUp() {
        sortingPlanet = new SortingPlanet();
    }

    /**
     * Test 1.
     */
    @Test
    public void testSortArray1() {
        final Integer[] actI1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final int[] expI1 = {1, 2, 7, 4, 5, 6, 3, 8, 9};
        assertArrayEquals(expI1, sortingPlanet.sortTwisted37(actI1));
    }

    /**
     * Test 2.
     */
    @Test
    public void testSortArray2() {
        final Integer[] actI2 = {9, 2, 4, 7, 3};
        final int[] expI2 = {2, 7, 4, 3, 9};
        assertArrayEquals(expI2, sortingPlanet.sortTwisted37(actI2));
    }

    /**
     * Test 3.
     */
    @Test
    public void testSortArray3() {
        final Integer[] actI3 = {12, 13, 14};
        final int[] expI3 = {12, 14, 13};
        assertArrayEquals(expI3, sortingPlanet.sortTwisted37(actI3));
    }

}
