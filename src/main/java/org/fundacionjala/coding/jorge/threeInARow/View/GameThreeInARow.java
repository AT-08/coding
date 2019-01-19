package org.fundacionjala.coding.jorge.threeInARow.View;

import org.fundacionjala.coding.jorge.threeInARow.Controller.Controller;

import java.util.Scanner;

public class GameThreeInARow {


    public static void main(String[] args) {
        star();
    }


    public static void star() {
        Scanner sc = new Scanner(System.in);
        String user1;
        String user2;
        System.out.println("Enter the name of the user number 1");
        user1 = sc.nextLine();
        System.out.println("Enter the name of the user number 2");
        user2 = sc.nextLine();
        Controller c = new Controller(user1, user2);
    }
}
