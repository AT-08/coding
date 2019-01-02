package org.fundacionjala.coding.rodrigo;

/**
 * Solved Kata.
 * https://www.codewars.com/kata/5263a84ffcadb968b6000513
 */
final class MatrixMultiplication {
    /**
     * Empty constructor.
     */
    private MatrixMultiplication() {
    }

    /**
     * Method of the multiplication of two matrix nxn.
     *
     * @param a Input matrix A.
     * @param b Input matrix B.
     * @return The multiplication.
     */
    static int[][] multiplication(final int[][] a, final int[][] b) {
        int rowA = a.length;
        int colB = b[0].length;
        int[][] result = new int[rowA][colB];
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < rowA; j++) {
                for (int k = 0; k < colB; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
}
