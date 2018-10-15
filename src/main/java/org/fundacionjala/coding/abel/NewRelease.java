package org.fundacionjala.coding.abel;


public class NewRelease extends Movie {
    private EnumMovie movieType = EnumMovie.NEW_RELEASE;
    private int frequentRenterPoints;


    NewRelease(final String title, final int daysRented) {
        super(title, daysRented);
        frequentRenterPoints = 1;
    }

    @Override
    void calculateCharge() {
        final int factor = 3;
        charge += getDaysRented() * factor;
    }

    public EnumMovie getMovieType() {
        return movieType;
    }

    @Override
    public int getFrequentRenterPoints() {
        if (getDaysRented() > 1) {
            frequentRenterPoints++;
        }
        return frequentRenterPoints;
    }
}