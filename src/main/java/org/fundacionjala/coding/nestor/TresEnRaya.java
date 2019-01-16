package org.fundacionjala.coding.nestor;

/**
 * Class Tres en Raya.
 */
public class TresEnRaya {
    private char[][] board;
    private static final char EMPTY = ' ';
    private static final int ROWS = 3;
    private static final int COLS = 3;

    /**
     * Method constructor.
     */
    public TresEnRaya() {
        board = new char[ROWS][COLS];
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                board[row][col] = EMPTY;
            }
        }
    }

    /**
     * Method to verify is cell with coordinates is free.
     * @param row type int.
     * @param col type int.
     * @return boolean type.
     */
    private boolean isCellFree(int row, int col) {
        return board[row][col] == EMPTY;
    }

    /**
     * Method to make move and mark in board coordinates.
     * @param row type int.
     * @param col type int.
     * @param mark type char.
     */
    public void makeMove(int row, int col, char mark) {
        if (isCellFree(row - 1, col - 1)) {
            board[row - 1][col - 1] = mark;
        }
    }

    /**
     * Method to get cell value.
     * @param row type int.
     * @param col type int.
     * @return type char.
     */
    public char getCellValue(int row, int col) {
        return board[row - 1][col - 1];
    }
}
