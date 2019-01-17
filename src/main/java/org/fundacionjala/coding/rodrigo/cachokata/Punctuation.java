package org.fundacionjala.coding.rodrigo.cachokata;

public enum Punctuation {
    GRANDE(50),
    POKER(40),
    FULL(30),
    ESCALERA(20);

    private final int score;

    Punctuation(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
}
