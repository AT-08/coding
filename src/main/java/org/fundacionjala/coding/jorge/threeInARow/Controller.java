package org.fundacionjala.coding.jorge.threeInARow;

public class Controller {
    private Board board;
    private Player player1;
    private Player player2;
    private Reviser reviser;

    public Controller(Player player1, Player player2) {
        board = new Board();
        this.player1 = player1;
        this.player2 = player2;
    }


}
