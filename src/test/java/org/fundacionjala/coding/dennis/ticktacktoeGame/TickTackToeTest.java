package org.fundacionjala.coding.dennis.ticktacktoeGame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Tests for the different status of the board.
 */
public class TickTackToeTest {

    /**
     * Check for game draw.
     */
    @Test
    public void checkDraw() {
        TickTackToe game = TickTackToe.getGameBoard();
        game.setTable(new char[]{'o', 'o', 'x'},
                new char[]{'x', 'x', 'o'},
                new char[]{'o', 'x', 'x'});
        assertTrue(game.checkDraw());
    }

    /**
     * Check for winner from up-left diagonal.
     */
    @Test
    public void checkDiagonalFromUpLeftWinner() {
        TickTackToe game = TickTackToe.getGameBoard();
        game.setTable(new char[]{'x', '_', 'x'},
                new char[]{'_', 'x', 'o'},
                new char[]{'o', 'o', 'x'});
        String result = "You win";
        assertEquals(result, game.checkStatusGame());
    }

    /**
     * Check for winner from up-right diagonal.
     */
    @Test
    public void checkDiagonalFromUpRightWinner() {
        TickTackToe game = TickTackToe.getGameBoard();
        game.setTable(new char[]{'o', 'o', 'x'},
                new char[]{'_', 'x', 'o'},
                new char[]{'x', '_', 'x'});
        String result = "You win";
        assertEquals(result, game.checkStatusGame());
    }

    /**
     * Check for winner in column 0.
     */
    @Test
    public void checkWinnerColumn0() {
        TickTackToe game = TickTackToe.getGameBoard();
        game.setTable(new char[]{'x', 'o', 'o'},
                new char[]{'x', 'x', '_'},
                new char[]{'x', '_', 'o'});
        String result = "You win";
        assertEquals(result, game.checkStatusGame());
    }

    /**
     * Check for winner in column 1.
     */
    @Test
    public void checkWinnerColumn1() {
        TickTackToe game = TickTackToe.getGameBoard();
        game.setTable(new char[]{'o', 'x', 'x'},
                new char[]{'o', 'x', '_'},
                new char[]{'_', 'x', 'o'});
        String result = "You win";
        assertEquals(result, game.checkStatusGame());
    }

    /**
     * Check for winner in column 2.
     */
    @Test
    public void checkWinnerColumn2() {
        TickTackToe game = TickTackToe.getGameBoard();
        game.setTable(new char[]{'o', 'o', 'x'},
                new char[]{'x', 'o', 'x'},
                new char[]{'_', '_', 'x'});
        String result = "You win";
        assertEquals(result, game.checkStatusGame());
    }

    /**
     * Check for winner in row 0.
     */
    @Test
    public void checkWinnerRow0() {
        TickTackToe game = TickTackToe.getGameBoard();
        game.setTable(new char[]{'o', 'o', 'o'},
                new char[]{'x', '_', 'x'},
                new char[]{'_', '_', 'x'});
        String result = "You win";
        assertEquals(result, game.checkStatusGame());
    }

    /**
     * Check for winner in row 1.
     */
    @Test
    public void checkWinnerRow1() {
        TickTackToe game = TickTackToe.getGameBoard();
        game.setTable(new char[]{'x', '_', '_'},
                new char[]{'o', 'o', 'o'},
                new char[]{'x', '_', 'x'});
        String result = "You win";
        assertEquals(result, game.checkStatusGame());
    }

    /**
     * Check for winner in row 3.
     */
    @Test
    public void checkWinnerRow3() {
        TickTackToe game = TickTackToe.getGameBoard();
        game.setTable(new char[]{'_', '_', 'x'},
                new char[]{'x', '_', 'x'},
                new char[]{'o', 'o', 'o'});
        String result = "You win";
        assertEquals(result, game.checkStatusGame());
    }

    /**
     * Check for winner in a full board.
     */
    @Test
    public void checkWinnerFullBoard() {
        TickTackToe game = TickTackToe.getGameBoard();
        game.setTable(new char[]{'x', 'o', 'x'},
                new char[]{'x', 'o', 'o'},
                new char[]{'x', 'x', 'o'});
        String result = "You win";
        assertEquals(result, game.checkStatusGame());
    }

    /**
     * Check for game still in play, random scenario.
     */
    @Test
    public void checkGameContinuesStatus1() {
        TickTackToe game = TickTackToe.getGameBoard();
        game.setTable(new char[]{'_', '_', 'o'},
                new char[]{'_', 'x', '_'},
                new char[]{'x', '_', 'o'});
        String result = "Game continues";
        assertEquals(result, game.checkStatusGame());
    }

    /**
     * Check for game still in play, random scenario.
     */
    @Test
    public void checkGameContinuesStatus2() {
        TickTackToe game = TickTackToe.getGameBoard();
        game.setTable(new char[]{'_', 'o', 'x'},
                new char[]{'_', 'x', 'x'},
                new char[]{'o', '_', '_'});
        String result = "Game continues";
        assertEquals(result, game.checkStatusGame());
    }

    /**
     * Check for game still in play, random scenario.
     */
    @Test
    public void checkGameContinuesStatus3() {
        TickTackToe game = TickTackToe.getGameBoard();
        game.setTable(new char[]{'o', 'x', 'x'},
                new char[]{'_', 'x', 'o'},
                new char[]{'o', 'o', 'x'});
        String result = "Game continues";
        assertEquals(result, game.checkStatusGame());
    }

    /**
     * Check for message of "position occupied" when player tries to put a token in a occupied position.
     */
    @Test
    public void checkPutTokenOccupied() {
        TickTackToe game = TickTackToe.getGameBoard();
        game.setTable(new char[]{'_', '_', '_'},
                new char[]{'_', 'x', '_'},
                new char[]{'_', '_', '_'});
        String result = "position occupied";
        assertEquals(result, game.putToken('o', 1, 1));
    }

    /**
     * Check for correct put of token.
     */
    @Test
    public void checkPutTokenAvailable() {
        TickTackToe game = TickTackToe.getGameBoard();
        game.setTable(new char[]{'_', '_', '_'},
                new char[]{'_', 'x', '_'},
                new char[]{'_', '_', '_'});
        String result = "token in position";
        assertEquals(result, game.putToken('o', 0, 1));
    }
}
