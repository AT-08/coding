package org.fundacionjala.coding.nestor;

public class NewReleasePrice extends Price {
    @Override
    MovieCode getPriceCode() {
        return MovieCode.NEW_RELEASE;
    }

    @Override
    public double getCharge(int daysRented) {
        return daysRented * 3;
    }
}
