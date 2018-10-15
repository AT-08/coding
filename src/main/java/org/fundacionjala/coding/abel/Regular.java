package org.fundacionjala.coding.abel;


public class Regular extends Movie {
    private EnumMovie movieType = EnumMovie.REGULAR;
    private int frequentRenterPoints;


    public Regular(final String title, final int daysRented) {
        super(title, daysRented);
        frequentRenterPoints = 1;
    }

    @Override
    public void calculateCharge() {
        final double factor = 1.5;
        final int two = 2;
        this.charge += two;
        if (getDaysRented() > two) {
            this.charge += (getDaysRented() - two) * factor;
        }
    }

    @Override
    public EnumMovie getMovieType() {
        return movieType;
    }

    @Override
    public int getFrequentRenterPoints() {
        return frequentRenterPoints;
    }
}