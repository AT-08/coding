package org.fundacionjala.coding.dennis;

/**
 *
 */
public abstract class Movie {
    private String title;
    private PriceCode priceCode;
    private static final int FREQUENTPOINTS = 1;

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
     * @return price.
     */
    public abstract float calculateAmount(int nDays);

    /**
     *
     * @return Frequent Point Bonus.
     */
    public int returnFreqPoints() {
        return FREQUENTPOINTS;
    }
}
