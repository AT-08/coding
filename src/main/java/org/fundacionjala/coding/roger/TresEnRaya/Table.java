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
        table = new String[][]{{" ", " ", " "}, {" ", " ", " "}, {" ", " ", " "}};
    }

    /**
     * @param symbol symbol of player.
     * @param pos    position.
     */
    public void setPosition(final String symbol, final String pos) {
        String[] position = pos.split("");
        table[Integer.parseInt(position[0])][Integer.parseInt(position[1])] = symbol;
    }

    /**
     * @return .
     */
    public boolean verifyWinner() {
        return (verifyRows() || verifyColumns() || verifyDiagonals());
    }

    /**
     * @return boolean is full Row.
     */
    public boolean verifyRows() {
        for (int i = 0; i < SIZETABLE; i++) {
            if (table[i][0].equals(table[i][1]) && (table[i][0].equals(table[i][2]))) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return boolean is full Column.
     */
    public boolean verifyColumns() {
        for (int j = 0; j < SIZETABLE; j++) {
            if (table[0][j].equals(table[1][j]) && (table[0][j].equals(table[2][j]))) {
                return true;
            }
        }
        return false;
    }

    /**
     * @return boolean is full diagonal.
     */
    public boolean verifyDiagonals() {
        boolean fullDiagonal = false;
        return fullDiagonal;
    }

    /**
     * Method for print table.
     */
    public void showTable() {
        System.out.println("- - - - - - - -");
        for (int i = 0; i < SIZETABLE; i++) {
            System.out.print("|");
            for (int j = 0; j < SIZETABLE; j++) {
                System.out.print(table[i][j] + "|");
            }
            System.out.println();
            System.out.println("- - - - - - - -");
        }
    }
}
