package org.fundacionjala.coding.abel.ThreeInARow;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *  this clas represent to
 */
public class Board {
    Map<String, Box> Board = new TreeMap<String, Box>();
    void createBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Board.put(i + "" + j, new Box("empty"));
            }
        }
    }

    /**
     *
     * @param inputvalue
     */
    void change(String inputvalue) {
       Board.put(inputvalue, new Box("azul"));
    }

    /**
     *
     */
    void printBoard() {
        for (Map.Entry<String, Box> box : Board.entrySet()){
            String clave = box.getKey();
            Box valor = box.getValue();
            System.out.println(clave+"  ->  "+valor.getValue());
        }
    }
}
