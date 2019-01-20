package org.fundacionjala.coding.dennis.ticktacktoegame;

/**
 * Tick-Tack-Toe board.
 */
public final class TickTackToe {

    private char[][] table;
    private static final int ZERO = 0;
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static TickTackToe gameBoard;

    /**
     * constructor.
     */
    private TickTackToe() {
        table = new char[][]{{'_', '_', '_'}, {'_', '_', '_'}, {'_', '_', '_'}};
    }

    /**
     * Singleton initialization.
     * @return instance of game board.
     */
    public static TickTackToe getGameBoard() {
        if (gameBoard == null) {
            gameBoard = new TickTackToe();
        }
        return gameBoard;
    }

    /**PRINT
     * prints the actual state of the board.
     *
    public void getTable() {
        System.out.println("Board:");
        for (int row = ZERO; row <= TWO; row++) {
            for (int column = ZERO; column <= TWO; column++) {
                System.out.print(table[row][column]);
                System.out.print(" | ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("");
    }
    */

    /**
     * Put a token in the position of the array.
     * @param token token for put in a position.
     * @param row row position.
     * @param column column position.
     * @return String with status of the action.
     */
    public String putToken(char token, int row, int column) {
        String message = table[row][column] != '_' ? "position occupied" : "token in position";
        table[row][column] = table[row][column] != '_' ? table[row][column] : token;
        return message;
    }

    /**
     * Check status game: win, draw or continue.
     * @return status.
     */
    public String checkStatusGame() {
        return checkWinner() ? "You win" : checkStatusNotWinGame();
    }

    /**
     * Check status fo the game when there is no a winner: draw or continue.
     * @return status.
     */
    private String checkStatusNotWinGame() {
        return checkDraw() ? "Game draw" : "Game continues";
    }

    /**
     * Check if there is a winner.
     * @return boolean if there is a winner.
     */
    private boolean checkWinner() {
        return checkRows() || checkColumns() || checkDiagonalFromUpLeft() || checkDiagonalFromUpRight();
    }

    /**
     * Check if there is a winner in columns.
     * @return boolean of the state.
     */
    private boolean checkColumns() {
        int columnCheck = 0;
        boolean check = false;
        while (columnCheck <= TWO && !check) {
            check = table[ZERO][columnCheck] == table[ONE][columnCheck] && table[ZERO][columnCheck] != '_';
            check = table[ONE][columnCheck] == table[TWO][columnCheck] && check;
            columnCheck++;
        }
        return check;
    }

    /**
     * Check if there is a winner in rows.
     * @return boolean of the state.
     */
    private boolean checkRows() {
        int rowCheck = 0;
        boolean check = false;
        while (rowCheck <= TWO && !check) {
            check = table[rowCheck][ZERO] == table[rowCheck][ONE] && table[rowCheck][ZERO] != '_';
            check = table[rowCheck][ONE] == table[rowCheck][TWO] && check;
            rowCheck++;
        }
        return check;
    }

    /**
     * Check if there is a winner in right to left diagonal.
     * @return boolean of the state.
     */
    private boolean checkDiagonalFromUpLeft() {
        boolean check = table[ZERO][ZERO] == table[ONE][ONE] && table[ZERO][ZERO] != '_';
        check = table[ONE][ONE] == table[TWO][TWO] && check;
        return check;
    }

    /**
     * Check if there is a winner in left to right diagonal.
     * @return boolean of the state.
     */
    private boolean checkDiagonalFromUpRight() {
        boolean check = table[ZERO][TWO] == table[ONE][ONE] && table[ZERO][TWO] != '_';
        check = table[ONE][ONE] == table[TWO][ZERO] && check;
        return check;
    }

    /**
     * Set tokens on the board, for tests purposes.
     * @param row1 first row.
     * @param row2 second row.
     * @param row3 third row.
     */
    protected void setTable(final char[] row1, final char[] row2, final char[] row3) {
        table = new char[][]{row1, row2, row3};
    }

    /**
     * Check if there is a draw game.
     * @return boolean of the state.
     */
    public boolean checkDraw() {
        boolean draw = true;
        for (int row = ZERO; row <= TWO; row++) {
            for (int column = ZERO; column <= TWO; column++) {
                draw = table[row][column] != '_' && draw;
            }
        }
        return draw;
    }
}
