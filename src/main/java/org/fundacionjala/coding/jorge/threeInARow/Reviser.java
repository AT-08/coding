package org.fundacionjala.coding.jorge.threeInARow;

public class Reviser {

    public boolean reviserGame(FieldToBoard[][] board) {
        int boardSize = board.length*2+2;
        for(int n = 0; n < boardSize; n++) {
            for(int m = 0; n < boardSize; n++) {
                if(board[n][m].getAvailable()) {
                    methodAsterik(board, n ,m);
                }
            }
        }
        return true;
    }

    private boolean methodAsterik(FieldToBoard[][] board, int n, int m) {
        return true;
    }
}
