package org.fundacionjala.coding.abel;

public abstract class Movie {
    private String title;
    private int daysRented;
    protected double charge;


    Movie(final String title, final int daysRented) {
        this.title = title;
        this.daysRented = daysRented;
        calculateCharge();
    }
    abstract void calculateCharge();
    public String getTitle() {
        return title;
    }

    public abstract EnumMovie getMovieType();

    public int getDaysRented() {
        return daysRented;
    }

    public double getCharge() {
        return charge;
    }
    public abstract int getFrequentRenterPoints();
}