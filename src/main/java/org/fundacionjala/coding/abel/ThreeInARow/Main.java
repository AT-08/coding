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

        Box casilla;
        String win = "";
        boolean estado2 = false;
        while (estado2 == false) {
            System.out.println("Juega player 1");

            System.out.println("ingrese fila:");
            int fila = leer.nextInt();
            System.out.println("ingrese Columna:");
            int columna = leer.nextInt();
            System.out.println("ingrese Valor: ");
            String valor = leer.next();

            tablero.change(new Box(valor, fila, columna));
            Player1 = Player1.concat(String.valueOf(fila)).concat(String.valueOf(columna));
            if (tablero.verifyWin(Player1) == true) {
                estado2 = true;
                win = "player2";
            }

            System.out.println("Juega player 2");

            System.out.println("ingrese fila:");
            int fila2 = leer.nextInt();
            System.out.println("ingrese Columna:");
            int columna2 = leer.nextInt();
            System.out.println("ingrese Valor: ");
            String valor2 = leer.next();


            tablero.change(new Box(valor2, fila2, columna2));

            Player2 = Player2.concat(String.valueOf(fila2)).concat(String.valueOf(columna2));
            if (tablero.verifyWin(Player2) == true) {
                estado2 = true;
                win = "player2";
            }


        }

        System.out.println("the win is :" + win);
    }
}
