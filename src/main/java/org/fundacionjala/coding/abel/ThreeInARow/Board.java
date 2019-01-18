package org.fundacionjala.coding.abel.ThreeInARow;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * this clas represent to
 */
public class Board {

    Box[][] taler = new Box[3][3];

    void createBoard() {


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                taler[i][j] = new Box("-", i, j);

            }
        }


        printBoard();
    }

    void change(Box casilla) {
        taler[casilla.getRow()][casilla.getFile()].setValue(casilla.getValue());
        printBoard();
    }


    /**
     *
     */
    void printBoard() {
        System.out.println("!" + taler[0][0].getValue() + "!" + taler[0][1].getValue() + "!" + taler[0][2].getValue() + "!");
        System.out.println("!" + taler[1][0].getValue() + "!" + taler[1][1].getValue() + "!" + taler[1][2].getValue() + "!");
        System.out.println("!" + taler[2][0].getValue() + "!" + taler[2][1].getValue() + "!" + taler[2][2].getValue() + "!");


    }


    boolean verifyWin(String cadena) {
        System.out.println("cadena" + cadena);
        Map<String, String> Board = new TreeMap<String, String>();
        Board.put("1", "000102");
        Board.put("2", "101112");
        Board.put("3", "202122");
        Board.put("4", "001020");
        Board.put("5", "011121");
        Board.put("6", "021222");

        Boolean status = Board.containsValue(cadena);
        System.out.println("estado de cadena" + status);
        return status;
    }
}

