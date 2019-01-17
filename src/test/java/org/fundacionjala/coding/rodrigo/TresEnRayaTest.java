package org.fundacionjala.coding.rodrigo;

import org.fundacionjala.coding.rodrigo.tresenraya.Marks;
import org.fundacionjala.coding.rodrigo.tresenraya.Player;
import org.fundacionjala.coding.rodrigo.tresenraya.TresEnRaya;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * Test for check the requirements of the problem.
 */
public class TresEnRayaTest {
    private TresEnRaya tresEnRaya;
    private static final int POS_ONE = 1;
    private static final int POS_TWO = 2;
    private static final int POS_THREE = 3;
    private static final int POS_FOUR = 4;
    private static final int POS_FIVE = 5;
    private static final int POS_SIX = 6;
    private static final int POS_SEVEN = 7;
    private static final int POS_EIGHT = 8;
    private static final int POS_NINE = 9;
    private final String[][] emptyTableGame = {{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};

    /**
     * Setting up the game.
     */
    @Before
    public void setUp() {
        tresEnRaya = new TresEnRaya(emptyTableGame);
    }

    /**
     * Test for check the fill of the game.
     */
    @Test
    public void phase1() {
        final String[][] expected = {{"O", "X", "O"}, {" ", "X", " "}, {" ", " ", " "}};
        tresEnRaya.fillBox(Marks.O, POS_ONE);
        tresEnRaya.fillBox(Marks.X, POS_TWO);
        tresEnRaya.fillBox(Marks.O, POS_THREE);
        tresEnRaya.fillBox(Marks.X, POS_FIVE);
        assertArrayEquals(expected, tresEnRaya.getTableGame());
    }

    /**
     * Test for check if the O wins.
     */
    @Test
    public void phase2Owins() {
        final String expected = "O wins";
        tresEnRaya.fillBox(Marks.X, POS_TWO);
        tresEnRaya.fillBox(Marks.O, POS_THREE);
        tresEnRaya.fillBox(Marks.X, POS_FOUR);
        tresEnRaya.fillBox(Marks.O, POS_FIVE);
        tresEnRaya.fillBox(Marks.O, POS_SIX);
        tresEnRaya.fillBox(Marks.O, POS_SEVEN);
        tresEnRaya.fillBox(Marks.X, POS_NINE);
        assertEquals(expected, tresEnRaya.checkWin());
    }

    /**
     * Test for check if the X wins.
     */
    @Test
    public void phase2Xwins() {
        final String expected = "X wins";
        tresEnRaya.fillBox(Marks.X, POS_ONE);
        tresEnRaya.fillBox(Marks.O, POS_TWO);
        tresEnRaya.fillBox(Marks.O, POS_THREE);
        tresEnRaya.fillBox(Marks.O, POS_FOUR);
        tresEnRaya.fillBox(Marks.X, POS_FIVE);
        tresEnRaya.fillBox(Marks.X, POS_SIX);
        tresEnRaya.fillBox(Marks.O, POS_SEVEN);
        tresEnRaya.fillBox(Marks.X, POS_EIGHT);
        tresEnRaya.fillBox(Marks.X, POS_NINE);
        assertEquals(expected, tresEnRaya.checkWin());
    }

    /**
     * Test for Check a draw in the game.
     */
    @Test
    public void phase3Draw() {
        final String expected = "Draw";
        tresEnRaya.fillBox(Marks.X, POS_ONE);
        tresEnRaya.fillBox(Marks.O, POS_TWO);
        tresEnRaya.fillBox(Marks.O, POS_THREE);
        tresEnRaya.fillBox(Marks.O, POS_FOUR);
        tresEnRaya.fillBox(Marks.X, POS_FIVE);
        tresEnRaya.fillBox(Marks.X, POS_SIX);
        tresEnRaya.fillBox(Marks.X, POS_SEVEN);
        tresEnRaya.fillBox(Marks.X, POS_EIGHT);
        tresEnRaya.fillBox(Marks.O, POS_NINE);
        assertEquals(expected, tresEnRaya.checkWin());
    }

    /**
     * Test of the player of the TresEnRaya.
     */
    @Test
    public void phase4Players() {
        Player juan = new Player(Marks.X, emptyTableGame);
        Player jorge = new Player(Marks.O, emptyTableGame);
        jorge.play(POS_ONE);
        juan.play(POS_TWO);
        jorge.play(POS_FIVE);
        juan.play(POS_SEVEN);
        jorge.play(POS_NINE);
        assertEquals("O wins", jorge.checkWin());
    }
}
