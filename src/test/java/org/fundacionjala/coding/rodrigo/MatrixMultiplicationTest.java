package org.fundacionjala.coding.rodrigo;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Test for the Matrix multiplication.
 */
public class MatrixMultiplicationTest {
    /**
     * Test for verify the multiplication of two matrix 2 x 2 .
     */
    @Test
    public void test2X2Matrix() {
        final int[][] a = {
                {9, 7},
                {0, 1}};

        final int[][] b = {
                {1, 1},
                {4, 12}};

        final int[][] expected = {
                {37, 93},
                {4, 12}};

        int[][] actual = MatrixMultiplication.multiplication(a, b);
        assertArrayEquals(expected, actual);
    }

    /**
     * Test for verify the multiplication of two matrix 3 x 3 .
     */
    @Test
    public void test3X3Matrix() {
        final int[][] a = {
                {1, 2, 3},
                {3, 2, 1},
                {2, 1, 3}};

        final int[][] b = {
                {4, 5, 6},
                {6, 5, 4},
                {4, 6, 5}};

        final int[][] expected = {
                {28, 33, 29},
                {28, 31, 31},
                {26, 33, 31}};

        int[][] actual = MatrixMultiplication.multiplication(a, b);
        assertArrayEquals(expected, actual);
    }
}
