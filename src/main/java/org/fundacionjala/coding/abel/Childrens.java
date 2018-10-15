package org.fundacionjala.coding.abel;



public class Childrens extends Movie {
    private EnumMovie movieType = EnumMovie.CHILDRENS;
    private int frequentRenterPoints;

    public Childrens(final String title, final int daysRented) {
        super(title, daysRented);
        frequentRenterPoints = 1;
    }

    @Override
    public void calculateCharge() {
        final double initial = 1.5;
        final int three = 3;
        final double factor = 1.5;
        charge += initial;
        if (getDaysRented() > three) {
            charge += (getDaysRented() - three) * factor;
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