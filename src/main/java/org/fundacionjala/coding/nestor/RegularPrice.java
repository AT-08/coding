package org.fundacionjala.coding.nestor;

public class RegularPrice extends  Price {
    @Override
    MovieCode getPriceCode() {
        return MovieCode.REGULAR;
    }

    @Override
    public double getCharge(int daysRented) {
        double price =  2;
        if (daysRented > 2) {
            price += (daysRented - 2) * 1.5;
        }

        return price;
    }
}
