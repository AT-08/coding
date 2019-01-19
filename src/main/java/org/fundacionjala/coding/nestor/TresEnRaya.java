package org.fundacionjala.coding.nestor;

import java.util.HashMap;
import java.util.Map;

/**
 * Class Tres en Raya.
 */
public class TresEnRaya {
    private char[][] board;
    private static final char EMPTY = ' ';
    private static final int ROWS = 3;
    private static final int COLS = 3;
    private Map<Character, String> players;

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
        players = new HashMap<>();
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
        char[] leftToRight = {board[0][0], board[1][1], board[2][2]};
        char[] rightToLeft = {board[0][2], board[1][1], board[2][0]};
        return isTheSameMark(leftToRight) || isTheSameMark(rightToLeft);
    }

    /**
     * Method to verify if board is full filled.
     * @return boolean.
     */
    public boolean isBoardFullFilled() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                if (board[row][col] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Method to add a player into game.
     * @param mark type char.
     * @param name type string.
     */
    public void addPlayer(final char mark, final String name) {
        players.put(mark, name);
    }

    /**
     * Method to get player's name given a mark.
     * @param mark type char.
     * @return type string.
     */
    public String getPlayerName(final char mark) {
        return players.get(mark);
    }

    /**
     * Method to verify is some mark is used by some one player.
     * @param mark type char.
     * @return type boolean.
     */
    public boolean isPlayerMark(final char mark) {
        return players.containsKey(mark);
    }
}
