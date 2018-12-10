package org.fundacionjala.coding.rodrigo.movierefactor;

/**
 * Abstract class for movie.
 */
public abstract class Movie {
    private String title;
    private int daysRented;
    protected double charge;

    /**
     * Constructor.
     *
     * @param title      of the movie.
     * @param daysRented of the movie.
     */
    Movie(final String title, final int daysRented) {
        this.title = title;
        this.daysRented = daysRented;
    }

    /**
     * Some calc of the charge.
     *
     * @return The calculated charge.
     */
    abstract double calculateCharge();

    /**
     * Getter about the title of the movie.
     *
     * @return title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Getter about the days of the rented movies.
     *
     * @return daysrented.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     * Getter of the Frequent renter points.
     *
     * @return the FRP.
     */
    public abstract int getFrequentRenterPoints();
}
