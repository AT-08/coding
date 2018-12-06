package org.fundacionjala.coding.abel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * this class make test of ShortTheOdd class.
 */
public class ShorTheOddTest {
    private ShorTheOdd shorTheOdd;

    /**
     * defined  instance of ShorTheOdd type.
     */
    @Before
    public void before() {
        shorTheOdd = new ShorTheOdd();
    }

    /**
     * test one.
     */
    @Test
    public void exampleTest1() {
        final int[] expected = {1, 3, 2, 8, 5, 4};
        final int[] actual = {5, 3, 2, 8, 1, 4};
        assertArrayEquals(expected, shorTheOdd.sortArray(actual));
    }

    /**
     * test two.
     */
    @Test
    public void exampleTest2() {
        final int[] expected = {1, 3, 5, 8, 0};
        final int[] actual = {5, 3, 1, 8, 0};
        assertArrayEquals(expected, shorTheOdd.sortArray(actual));
    }

    /**
     * test tree.
     */
    @Test
    public void exampleTest3() {
        final int[] expected = {};
        final int[] actual = {};
        assertArrayEquals(expected, shorTheOdd.sortArray(actual));
    }
}
