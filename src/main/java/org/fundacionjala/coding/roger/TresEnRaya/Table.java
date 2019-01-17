package org.fundacionjala.coding.roger.TresEnRaya;

/**
 * Table of game.
 */
public final class Table {
    private String[][] table;
    private static final int SIZETABLE = 3;

    /**
     * Empty constructor.
     */
    private Table() {
        table = new String[SIZETABLE][SIZETABLE];
    }

    /**
     *
     * @param symbol symbol of player.
     * @param row row of position.
     * @param column column of position.
     */

    public void setPosition(final String symbol, final int row, final int column) {
        table[row][column] = symbol;
        verifyWinner(symbol);
    }

    /**
     *
     * @param symbol symbol of player.
     */

    public void verifyWinner(final String symbol) {
        //verifyRows(symbol);
        //verifyColumns(symbol);
        //verifyDiagonals(symbol);
    }

    /**
     *
     * @param symbol symbol of player.
     * @return boolean is full Row.
     */
    public boolean verifyRows(final String symbol) {
        boolean fullRow = false;

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (table[i][j].equals(symbol)) {
                    fullRow = true;
                }
            }
        }
        return fullRow;
    }

    /**
     * @param symbol symbol of player.
     * @return boolean is full Column.
     */
    public boolean verifyColumns(final String symbol) {
        boolean fullColumn = false;
        return fullColumn;
    }

    /**
     * @param symbol symbol of player.
     * @return boolean is full diagonal.
     */
    public boolean verifyDiagonals(final String symbol) {
        boolean fullDiagonal = false;
        return fullDiagonal;
    }
}
