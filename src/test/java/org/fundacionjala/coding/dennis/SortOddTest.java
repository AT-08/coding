package org.fundacionjala.coding.dennis;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortOddTest {

    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, SortOdd.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, SortOdd.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, SortOdd.sortArray(new int[]{}));
    }


    @Test
    public void exampleTest4() {
        assertArrayEquals(new int[]{8,78,20,3,11,30,11,45,14}, SortOdd.sortArray(new int[]{8,78,20,3,11,30,45,11,14}));
    }
}