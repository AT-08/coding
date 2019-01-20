package org.fundacionjala.coding.dennis.ticktacktoegame;

/**
 * Player of Tick-Tack-Toe game.
 */
public class ToePlayer {
    private char token;
    private TickTackToe gameBoard;

    /**
     * Get the token of the player.
     * @return token character.
     */
    public char getToken() {
        return token;
    }

    /**
     * Constructor of the player.
     * @param tokenAssign assigned token for the player.
     */
    public ToePlayer(final char tokenAssign) {
        token = tokenAssign;
        gameBoard = TickTackToe.getGameBoard();
    }

    /**
     * Function for player puts his token.
     * @param row row coordinate.
     * @param column column coordinate.
     * @return State of the action.
     */
    public String putToken(final int row, final int column) {
        return gameBoard.putToken(token, row, column);
    }
}
