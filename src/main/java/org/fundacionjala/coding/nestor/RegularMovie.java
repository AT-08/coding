package org.fundacionjala.coding.nestor;

public class RegularMovie extends Movie {
    private static double price = 2;
    private static final double factor = 1.5;
    private static final int days = 3;

    public RegularMovie(String title) {
        super(title, MovieType.REGULAR);
    }

    @Override
    public double getPrice(int daysRented) {
        if (daysRented > days) {
            price += (daysRented - days) * factor;
        }

        return price;
    }
}
