package org.fundacionjala.coding.jorge.threeInARow.Controller;

import org.fundacionjala.coding.jorge.threeInARow.MarkerType;
import org.fundacionjala.coding.jorge.threeInARow.Model.Board;
import org.fundacionjala.coding.jorge.threeInARow.Model.Player;
import org.fundacionjala.coding.jorge.threeInARow.Model.Reviser;

public class Controller {
    private Board board;
    private Player player1;
    private Player player2;
    private Reviser reviser;

    public Controller(final String player1, final String player2) {
        board = new Board();
        this.player1 = new Player(player1, MarkerType.MARKER1);
        this.player2 = new Player(player2, MarkerType.MARKER2);
    }

}
