package org.fundacionjala.coding.dennis;

/**
 *
 */
public abstract class Movie {
    private String title;
    private PriceCode priceCode;

    /**
     *
     * @param title of the movie.
     */
    public Movie(final String title) {
        this.title = title;
    }

    /**
     *
     * @return title.
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @return price.
     */
    public PriceCode getPriceCode() {
        return priceCode;
    }

    /**
     *
     * @param priceCode price.
     */
    public void setpriceCode(final PriceCode priceCode) {
        this.priceCode = priceCode;
    }

    /**
     *
     * @param nDays days rented.
     * @return Frequent points bonus.
     */
    public int returnFrequentPoints(int nDays) {
        return 1;
    }

    /**
     *
     * @param nDays days rented.
     * @return price.
     */
    public abstract float calculateAmount(int nDays);
}
