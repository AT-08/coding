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
     * @param film film a ser evaluado.
     * @return frequent points bonus.
     */
    public int calculateFrequentRenterPoints(final Movie film) {
        if (film instanceof MovieNewRelease) {
            return getDaysRented() > 1 ? 2 : film.returnFreqPoints();
        }
        return film.returnFreqPoints();
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
