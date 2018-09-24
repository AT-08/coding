package org.fundacionjala.coding.nestor;

public class RegularMovie extends Movie {
    private static double PRICE = 2;


    public RegularMovie(String title) {
        super(title, MovieType.REGULAR);
    }

    @Override
    public double getPrice(int daysRented) {
        if (daysRented > DAYS) {
            PRICE += (daysRented - DAYS) * FACTOR;
        }

        return PRICE;
    }
}
