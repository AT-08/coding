package org.fundacionjala.coding.rodrigo.tresenraya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Problem of Tres en Raya.
 */
public class TresEnRaya {
    private String[][] tableGame;
    private static final int POS_ONE = 1;
    private static final int POS_TWO = 2;
    private static final int POS_THREE = 3;
    private static final int POS_FOUR = 4;
    private static final int POS_FIVE = 5;
    private static final int POS_SIX = 6;
    private static final int POS_SEVEN = 7;
    private static final int POS_EIGHT = 8;
    private static final int POS_NINE = 9;

    /**
     * Constructor of the class.
     *
     * @param tableGame Input tableGame.
     */
    public TresEnRaya(final String[][] tableGame) {
        this.tableGame = Arrays.copyOf(tableGame, tableGame.length);
    }

    /**
     * Method for fill any box of the game.
     * <p>
     * The table game its filled by the followings positions.
     * <p>
     * 1|2|3
     * 4|5|6
     * 7|8|9
     *
     * @param mark Input mark to fill.
     * @param pos  Position of the box.
     */
    public void fillBox(final Marks mark, final int pos) {
        HashMap<Integer, IRun> mapTable = new HashMap<>();
        mapTable.put(POS_ONE, this::fillPosOne);
        mapTable.put(POS_TWO, this::fillPosTwo);
        mapTable.put(POS_THREE, this::fillPosThree);
        mapTable.put(POS_FOUR, this::fillPosFour);
        mapTable.put(POS_FIVE, this::fillPosFive);
        mapTable.put(POS_SIX, this::fillPosSix);
        mapTable.put(POS_SEVEN, this::fillPosSeven);
        mapTable.put(POS_EIGHT, this::fillPosEight);
        mapTable.put(POS_NINE, this::fillPosNine);
        mapTable.get(pos).run(mark.toString());
    }

    /**
     * Method for check who wins.
     *
     * @return String about the winner.
     */
    public String checkWin() {
        ArrayList<String> wins = new ArrayList<>();
        wins.add(tableGame[0][0].concat(tableGame[1][1]).concat(tableGame[2][2]));
        wins.add(tableGame[0][2].concat(tableGame[1][1]).concat(tableGame[2][0]));
        wins.add(tableGame[0][0].concat(tableGame[0][1]).concat(tableGame[0][2]));
        wins.add(tableGame[1][0].concat(tableGame[1][1]).concat(tableGame[1][2]));
        wins.add(tableGame[2][0].concat(tableGame[2][1]).concat(tableGame[2][2]));
        wins.add(tableGame[0][0].concat(tableGame[1][0]).concat(tableGame[2][0]));
        wins.add(tableGame[0][1].concat(tableGame[1][1]).concat(tableGame[2][1]));
        wins.add(tableGame[0][2].concat(tableGame[1][2]).concat(tableGame[2][2]));
        if (wins.contains("XXX")) {
            return "X wins";
        }
        if (wins.contains("OOO")) {
            return "O wins";
        }
        return "Draw";
    }

    /**
     * Getter of the game Table.
     *
     * @return The Game Table.
     */
    public String[][] getTableGame() {
        return Arrays.copyOf(tableGame, tableGame.length);
    }

    /**
     * Method for fill the position 1.
     *
     * @param mark Mark used to fill.
     */
    private void fillPosOne(final String mark) {
        tableGame[0][0] = mark;
    }

    /**
     * Method for fill the position 2.
     *
     * @param mark Mark used to fill.
     */
    private void fillPosTwo(final String mark) {
        tableGame[0][1] = mark;
    }

    /**
     * Method for fill the position 3.
     *
     * @param mark Mark used to fill.
     */
    private void fillPosThree(final String mark) {
        tableGame[0][2] = mark;
    }

    /**
     * Method for fill the position 4.
     *
     * @param mark Mark used to fill.
     */
    private void fillPosFour(final String mark) {
        tableGame[1][0] = mark;
    }

    /**
     * Method for fill the position 5.
     *
     * @param mark Mark used to fill.
     */
    private void fillPosFive(final String mark) {
        tableGame[1][1] = mark;
    }

    /**
     * Method for fill the position 6.
     *
     * @param mark Mark used to fill.
     */
    private void fillPosSix(final String mark) {
        tableGame[1][2] = mark;
    }

    /**
     * Method for fill the position 7.
     *
     * @param mark Mark used to fill.
     */
    private void fillPosSeven(final String mark) {
        tableGame[2][0] = mark;
    }

    /**
     * Method for fill the position 8.
     *
     * @param mark Mark used to fill.
     */
    private void fillPosEight(final String mark) {
        tableGame[2][1] = mark;
    }

    /**
     * Method for fill the position 9.
     *
     * @param mark Mark used to fill.
     */
    private void fillPosNine(final String mark) {
        tableGame[2][2] = mark;
    }

}
