package org.fundacionjala.coding.nestor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Test class.
 */
public class TresEnRayaTest {
    private TresEnRaya tablero;

    /**
     * Method to initialize tablero object.
     */
    @Before
    public void setup() {
        tablero = new TresEnRaya();
        tablero.makeMove(1, 1, 'X');
    }

    /**
     * Method to test if board can accept mark.
     */
    @Test
    public void testBoardCanAcceptMark() {
        assertTrue("Is mark X.",
                "X".equalsIgnoreCase(Character.toString(tablero.getCellValue(1, 1))));
    }

    /**
     * Method to verify if last move is won.
     */
    @Test
    public void testLastMoveIsWon() {
        final int row = 1;
        final int col = 2;
        tablero.makeMove(row, col, 'X');
        tablero.makeMove(row, col + 1, 'X');
        assertTrue("Last move is winner.", tablero.isMoveWinner());
    }

    /**
     * Method to verify if player is draw.
     */
    @Test
    public void testIsDraw() {
        final TresEnRaya boardDraw = new TresEnRaya();
        final int row = 1;
        final int col = 1;
        boardDraw.makeMove(row, col, 'X');
        boardDraw.makeMove(row + 1, col, '0');
        boardDraw.makeMove(row + 2, col, 'X');
        boardDraw.makeMove(row, col + 1, '0');
        boardDraw.makeMove(row + 1, col + 1, 'X');
        boardDraw.makeMove(row + 2, col + 1, '0');
        boardDraw.makeMove(row, col + 2, '0');
        boardDraw.makeMove(row + 1, col + 2, 'X');
        boardDraw.makeMove(row + 2, col + 2, '0');
        assertTrue("Players are draw", boardDraw.isBoardFullFilled());
    }

    /**
     * Method to verify if can add a player.
     */
    @Test
    public void testAddPlayer() {
        tablero.addPlayer('0', "Player One");
        assertTrue("Player success added", "Player One".contentEquals(tablero.getPlayerName('0')));
    }

    /**
     * Method to verify if one player can choose mark.
     */
    @Test
    public void testChooseMark() {
        tablero.addPlayer('X', "Player Two");
        assertTrue("Exist X mark", tablero.isPlayerMark('X'));
    }
}
