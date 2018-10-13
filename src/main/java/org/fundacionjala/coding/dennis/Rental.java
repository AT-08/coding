package org.fundacionjala.coding.dennis;

/**
 *
 */
public class Rental {
    private Movie movie;
    private int daysRented;

    /**
     *
     * @return price.
     */
    public float calculatePriceMovie() {
        return getMovie().calculateAmount(getDaysRented());
    }

    /**
     *
     * @return Bonus points.
     */
    public int calculateFrequentRenterPoints() {
        return getMovie().returnFrequentPoints(getDaysRented());
    }

    /**
     *
     * @param movie movie.
     * @param daysRented days rented.
     */
    public Rental(final Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    /**
     *
     * @return days rented.
     */
    public int getDaysRented() {
        return daysRented;
    }

    /**
     *
     * @return movie.
     */
    public Movie getMovie() {
        return movie;
    }
}
