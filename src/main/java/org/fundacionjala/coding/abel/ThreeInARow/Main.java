package org.fundacionjala.coding.abel.ThreeInARow;

import java.util.Scanner;
import java.util.StringJoiner;

public class Main {


    public static void main(String[] args) {
/*

        Board tablero = new Board();
        tablero.createBoard();
        tablero.change(new Box("X", 0, 0));
        tablero.change(new Box("Y", 0, 1));
        tablero.change(new Box("X", 0, 2));
        tablero.change(new Box("Y", 1, 0));
        tablero.change(new Box("X", 1, 1));
        tablero.change(new Box("Y", 1, 2));
        tablero.change(new Box("X", 2, 0));
        tablero.change(new Box("Y", 2, 1));
        tablero.change(new Box("X", 2, 2));
        tablero.printBoard();
*/

        Board tablero = new Board();
        tablero.createBoard();
        Scanner leer = new Scanner(System.in);
        int index = 0;
        String Player1 = "";
        String Player2 = "";

        Box casilla ;
        while (index++ < 4) {

            System.out.println("ingrese fila:");
            int fila = leer.nextInt();


            System.out.println("ingrese Columna:");
            int columna = leer.nextInt();

            System.out.println("ingrese Valor: ");
            String valor = leer.next();


     tablero.change(new Box(valor,fila,columna));

            Player1 = Player1.concat(String.valueOf(fila)).concat(String.valueOf(columna));
            tablero.verifyWin(Player1);


        }


    }
}
