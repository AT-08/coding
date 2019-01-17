package org.fundacionjala.coding.rodrigo.tresenraya;

/**
 * Class of the player of TresEnRaya game.
 */
public class Player extends TresEnRaya {
    private Marks mark;

    /**
     * Constructor of the Player.
     *
     * @param selectedMark Picked mark.
     * @param tableGame    Empty Game.
     */
    public Player(final Marks selectedMark, final String[][] tableGame) {
        super(tableGame);
        this.mark = selectedMark;
    }

    /**
     * Method for play with the picked mark.
     *
     * @param pos Position to play.
     */
    public void play(int pos) {
        super.fillBox(mark, pos);
    }

}
