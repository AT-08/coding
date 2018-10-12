package org.fundacionjala.coding.abel;


public abstract class Movie {

    protected static final double FACTOR = 1.5;
    protected static final int DAYS = 3;
    protected static final int RENTER_POINTS = 1;
    protected String title;
    protected int daysRented;

    public Movie(final String title) {
        this.title = title;
    }
    public void setDaysRented(final int daysRented) {
        this.daysRented = daysRented;
    }

    public String getTitle() {
        return title;
    }

    public abstract double getPrice();

    public abstract int getRenterPoints();

}