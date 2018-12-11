package org.fundacionjala.coding.nestor;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Testing Sort the odd class.
 */
public class SortTheOddTest {
    private SortTheOdd sortTheOdd;

    /**
     * Method to setup initializations.
     */
    @Before
    public void setup() {
        sortTheOdd = new SortTheOdd();
    }

    /**
     * Method testing some odd elements.
     */
    @Test
    public void exampleTest1() {
        final int[] test = {5, 3, 2, 8, 1, 4};
        final int[] expected = {1, 3, 2, 8, 5, 4};

        Assert.assertArrayEquals(expected, sortTheOdd.sortArray(test));
    }

    /**
     * Method testing with zero value.
     */
    @Test
    public void exampleTest2() {
        final int[] test = {5, 3, 1, 8, 0};
        final int[] expected = {1, 3, 5, 8, 0};

        Assert.assertArrayEquals(expected, sortTheOdd.sortArray(test));
    }

    /**
     * Method testing empty array.
     */
    @Test
    public void exampleTest3() {
        final int[] test = {};

        Assert.assertArrayEquals(test, sortTheOdd.sortArray(test));
    }
}
