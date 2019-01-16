package org.fundacionjala.coding.nestor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Test class.
 */
public class TresEnRayaTest {
    private TresEnRaya tablero;
    private static final String MARK_X = "X";

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
        assertTrue("Is marl X",
                MARK_X.equalsIgnoreCase(Character.toString(tablero.getCellValue(1, 1))));
    }

    /**
     * Method to verify if last move is won.
     */
    @Test
    public void testLastMoveIsWon() { }

    /**
     * Method to verify if player is draw.
     */
    @Test
    public void testIsDraw() { }

    /**
     * Method to verify if can add a player.
     */
    @Test
    public void testAddPlayer() { }

    /**
     * Method to verify if one player can choose mark.
     */
    @Test
    public void testChooseMark() { }
}
