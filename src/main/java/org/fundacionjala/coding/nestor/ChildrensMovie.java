package org.fundacionjala.coding.nestor;

public class ChildrensMovie extends Movie {
    private static double price = 1.5;
    private static final double factor = 1.5;
    private static final int days = 3;

    public ChildrensMovie(String title) {
        super(title, MovieType.CHILDRENS);
    }

    @Override
    public double getPrice(int daysRented) {
        if (daysRented > days) {
            price += (daysRented - days) * factor;
        }

        return price;
    }
}
