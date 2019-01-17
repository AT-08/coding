package org.fundacionjala.coding.abel.ThreeInARow;

import org.junit.Test;

public class BoardTest {

    private Board board;

    @Test
    public void test1() {
        board = new Board();
        board.createBoard(3);
        board.change("11");
    }


}