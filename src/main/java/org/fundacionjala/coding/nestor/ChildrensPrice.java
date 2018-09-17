package org.fundacionjala.coding.nestor;

public class ChildrensPrice extends Price {
    @Override
    public MovieCode getPriceCode() {
        return MovieCode.CHILDRENS;
    }

    @Override
    public double getCharge(int daysRented) {
        double price =  1.5;
        if (daysRented > 3) {
            price += (daysRented - 3) * 1.5;
        }

        return price;
    }
}
