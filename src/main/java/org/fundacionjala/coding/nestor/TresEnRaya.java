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

    /**
     * Method to verify is last move was winner.
     * @return boolean.
     */
    public boolean isMoveWinner() {
        return isAnyColWinner() || isAnyRowWinner() || isAnyDiagonalWinner();
    }

    /**
     * Method to verify what type es all elements.
     * @param elements type array of chars.
     * @return boolean.
     */
    private boolean isTheSameMark(final char[] elements) {
        char first = elements[0];
        if (first != EMPTY) {
            return elements[0] == elements[1] && elements[0] == elements[2];
        }
        return false;
    }

    /**
     * Method to verify if some row is winner.
     * @return boolean.
     */
    private boolean isAnyRowWinner() {
        for (int row = 0; row < ROWS; row++) {
            char[] elements = {board[row][0], board[row][1], board[row][2]};
            if (isTheSameMark(elements)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method to verify if some column is winner.
     * @return boolean.
     */
    private boolean isAnyColWinner() {
        for (int col = 0; col < COLS; col++) {
            char[] elements = {board[0][col], board[1][col], board[2][col]};
            if (isTheSameMark(elements)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Method to verify if some diagonal is winner.
     * @return boolean.
     */
    private boolean isAnyDiagonalWinner() {
        int row = 0;
        int col = 0;
        char[] leftToRight = {board[row][col], board[row++][col++], board[row++][col++]};
        char[] rightToLeft = {board[row][col], board[row--][col--], board[row--][col--]};
        return isTheSameMark(leftToRight) || isTheSameMark(rightToLeft);
    }
}
