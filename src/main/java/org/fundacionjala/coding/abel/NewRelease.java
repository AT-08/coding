package org.fundacionjala.coding.abel;

public class NewRelease extends Movie {


    public NewRelease(String title) {
        super(title);
    }

    @Override
    public double getPrice() {
        return (double) (daysRented * DAYS);
    }

    @Override
    public int getRenterPoints() {
        return daysRented > 1 ? RENTER_POINTS + 1 : RENTER_POINTS;
    }

}