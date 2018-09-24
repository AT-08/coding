package org.fundacionjala.coding.nestor;

public class ChildrenMovie extends Movie {
    private static double PRICE = 1.5;

    public ChildrenMovie(String title) {
        super(title, MovieType.CHILDRENS);
    }

    @Override
    public double getPrice(int daysRented) {
        if (daysRented > DAYS) {
            PRICE += (daysRented - DAYS) * FACTOR;
        }

        return PRICE;
    }
}
