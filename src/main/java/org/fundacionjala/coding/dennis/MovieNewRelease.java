package org.fundacionjala.coding.dennis;

/**
 *
 */
public class MovieNewRelease extends Movie {

    public static final int TWO = 2;

    /**
     *
     * @param title of the movie.
     */
    public MovieNewRelease(final String title) {
        super(title);
        setpriceCode(PriceCode.NEW_RELEASE);
    }

    /**
     *
     * @param nDays days rented.
     * @return price.
     */
    @Override
    public float calculateAmount(int nDays) {
        return nDays * getPriceCode().getValue();
    }
}
