package org.fundacionjala.coding.wilson;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import java.util.Random;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

/**
 *
 */
public class SortTheOddTest {

    /**
     *
     */
    @Test
    public void exampleTest1() {
        final int[] t1 = {1, 3, 2, 8, 5, 4};
        final int[] s1 = {5, 3, 2, 8, 1, 4};
        assertArrayEquals(t1, SortTheOdd.sortArray(s1));
    }

    /**
     *
     */
    @Test
    public void exampleTest2() {
        final int[] t1 = {1, 3, 5, 8, 0};
        final int[] s1 = {5, 3, 1, 8, 0};
        assertArrayEquals(t1, SortTheOdd.sortArray(s1));
    }

    /**
     *
     */
    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, SortTheOdd.sortArray(new int[]{}));
    }

    /**
     *
     */
    @Test
    public void extendedTest1() {
        final int[] t1 = {1, 3, 2, 8, 5, 4, 11};
        final int[] s1 = {5, 3, 2, 8, 1, 4, 11};
        assertArrayEquals(t1, SortTheOdd.sortArray(s1));
    }

    /**
     *
     */
    @Test
    public void extendedTest2() {
        final int[] t1 = {2, 22, 1, 5, 4, 11, 37, 0};
        final int[] s1 = {2, 22, 37, 11, 4, 1, 5, 0};
        assertArrayEquals(t1, SortTheOdd.sortArray(s1));
    }

    /**
     *
     */
    @Test
    public void extendedTest3() {
        final int[] t1 = {1, 1, 5, 11, 2, 11, 111, 0};
        final int[] s1 = {1, 111, 11, 11, 2, 1, 5, 0};
        assertArrayEquals(t1, SortTheOdd.sortArray(s1));
    }

    /**
     *
     */
    @Test
    public void extendedTest4() {
        final int[] t1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        final int[] s1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        assertArrayEquals(t1, SortTheOdd.sortArray(s1));
    }

    /**
     *
     */
    @Test
    public void extendedTest5() {
        final int[] t1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        final int[] s1 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(t1, SortTheOdd.sortArray(s1));
    }

    /**
     *
     */
    @Test
    public void extendedTest6() {
        final int[] t1 = {0, 1, 2, 3, 4, 5, 8, 7, 6, 9};
        final int[] s1 = {0, 1, 2, 3, 4, 9, 8, 7, 6, 5};
        assertArrayEquals(t1, SortTheOdd.sortArray(s1));
    }
}
