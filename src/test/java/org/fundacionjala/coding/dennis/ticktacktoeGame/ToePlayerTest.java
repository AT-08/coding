package org.fundacionjala.coding.dennis.ticktacktoeGame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests for player of tick-tack-toe game.
 */
public class ToePlayerTest {

    /**
     * Check for creation of player with his assigned token.
     */
    @Test
    public void getTokenTest() {
        char token = 'o';
        ToePlayer player = new ToePlayer(token);
        assertEquals(token, player.getToken());
    }

    /**
     * Check for message of "position occupied" when player tries to put a token in a occupied position.
     */
    @Test
    public void putTokenTestOccupied() {
        TickTackToe game = TickTackToe.getGameBoard();
        char token = 'o';
        ToePlayer player = new ToePlayer(token);
        game.setTable(new char[]{'_', '_', 'o'},
                new char[]{'_', 'x', '_'},
                new char[]{'x', '_', 'o'});
        String result = "position occupied";
        assertEquals(result, player.putToken(1, 1));
    }

    /**
     * Check for correct put of token.
     */
    @Test
    public void putTokenTestAvailable() {
        TickTackToe game = TickTackToe.getGameBoard();
        char token = 'o';
        ToePlayer player = new ToePlayer(token);
        game.setTable(new char[]{'o', '_', '_'},
                new char[]{'_', 'x', '_'},
                new char[]{'o', '_', 'x'});
        String result = "token in position";
        assertEquals(result, player.putToken(1, 0));
    }
}
