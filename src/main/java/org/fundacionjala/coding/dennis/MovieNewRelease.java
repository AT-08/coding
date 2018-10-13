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

    /**
     *
     * @param nDays days rented.
     * @return frequent points bonus.
     */
    @Override
    public int returnFrequentPoints(int nDays) {
        return nDays > 1 ? TWO : 1;
    }
}
