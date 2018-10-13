package org.fundacionjala.coding.dennis;

/**
 *
 */
public class MovieRegular extends Movie {

    public static final int TWO = 2;
    public static final float FACTOR = 1.5f;

    /**
     *
     * @param title of the movie.
     */
    public MovieRegular(final String title) {
        super(title);
        setpriceCode(PriceCode.REGULAR);
    }

    /**
     *
     * @param nDays days rented.
     * @return price.
     */
    @Override
    public float calculateAmount(int nDays) {
        float amount = getPriceCode().getValue();
        amount = nDays > TWO ? amount + (nDays - TWO) * FACTOR : amount;
        return amount;
    }
}
