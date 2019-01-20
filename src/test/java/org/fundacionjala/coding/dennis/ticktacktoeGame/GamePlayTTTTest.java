package org.fundacionjala.coding.dennis.ticktacktoeGame;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

import static org.junit.Assert.assertEquals;

/**
 * Test of the sequence of the game.
 */
public class GamePlayTTTTest {

    /**
     * Check draw game scenario.
     */
    @Test
    public void gameDraw() {
        ToePlayer player1 = new ToePlayer('x');
        ToePlayer player2 = new ToePlayer('o');
        TickTackToe gameBoard = TickTackToe.getGameBoard();
        GamePlayTTT toe = new GamePlayTTT(player1, player2, gameBoard);
        gameBoard.setTable(new char[]{'x', 'o', 'O'},
                new char[]{'o', 'x', 'x'},
                new char[]{'x', 'x', 'o'});
        String result = "Game draw";
        assertEquals(result, toe.game());
    }

    /**
     * Check winner scenario.
     */
    @Test
    public void gameWinner() {
        ToePlayer player1 = new ToePlayer('x');
        ToePlayer player2 = new ToePlayer('o');
        TickTackToe gameBoard = TickTackToe.getGameBoard();
        GamePlayTTT toe = new GamePlayTTT(player1, player2, gameBoard);
        gameBoard.setTable(new char[]{'o', '_', 'o'},
                new char[]{'_', 'x', 'o'},
                new char[]{'x', 'x', 'x'});
        String result = "You win";
        assertEquals(result, toe.game());
    }

    /**
     * Check winner with entered data scenario.
     * https://stackoverflow.com/questions/31635698/junit-testing-for-user-input-using-scanner.
     * https://stackoverflow.com/questions/10347435/found-reliance-on-default-encoding.
     */
    @Test
    public void gameWinnerWithEnteredData() {
        String input = "down";
        InputStream in = new ByteArrayInputStream(input.getBytes(Charset.forName("UTF-8")));
        System.setIn(in);
        ToePlayer player1 = new ToePlayer('x');
        ToePlayer player2 = new ToePlayer('o');
        TickTackToe gameBoard = TickTackToe.getGameBoard();
        gameBoard.setTable(new char[]{'o', '_', 'o'},
                new char[]{'_', 'x', 'o'},
                new char[]{'x', '_', 'x'});
        GamePlayTTT toe = new GamePlayTTT(player1, player2, gameBoard);
        String result = "You win";
        assertEquals(result, toe.game());
    }

    /**
     * Check game draw with entered data scenario.
     */
    @Test
    public void gameDrawWithEnteredData() {
        String input = "down right";
        InputStream in = new ByteArrayInputStream(input.getBytes(Charset.forName("UTF-8")));
        System.setIn(in);
        ToePlayer player1 = new ToePlayer('x');
        ToePlayer player2 = new ToePlayer('o');
        TickTackToe gameBoard = TickTackToe.getGameBoard();
        gameBoard.setTable(new char[]{'o', 'x', 'o'},
                new char[]{'o', 'x', 'x'},
                new char[]{'x', 'o', '_'});
        GamePlayTTT toe = new GamePlayTTT(player1, player2, gameBoard);
        String result = "Game draw";
        assertEquals(result, toe.game());
    }
}
