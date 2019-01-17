package org.fundacionjala.coding.jorge.threeInARow;

public class Board implements MoveFields{

    private FieldToBoard[][] board;

    public Board() {
        this.board = new FieldToBoard[][]{
            { new FieldToBoard(), new FieldToBoard(), new FieldToBoard() },
            { new FieldToBoard(), new FieldToBoard(), new FieldToBoard() },
            { new FieldToBoard(), new FieldToBoard(), new FieldToBoard() }
        };
    }

    public FieldToBoard[][] getBoard() {
        return board;
    }

    @Override
    public void methodMark(int rowNumber, int columnNumber, MarkerType mark) {
        if(board[rowNumber][columnNumber].getAvailable()) {
            board[rowNumber][columnNumber].setStateField(mark);
        }else{
            System.out.println("Not available");
        }
    }
}
