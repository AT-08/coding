package org.fundacionjala.coding.abel.ThreeInARow;

import org.junit.Test;

public class BoardTest {

    private Board board;

    @Test
    public void test1() {
        board = new Board();
        board.createBoard();
        board.change("11");
    }
}