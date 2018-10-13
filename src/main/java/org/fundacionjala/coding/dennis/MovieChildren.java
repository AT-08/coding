package org.fundacionjala.coding.dennis;

/**
 *
 */
public class MovieChildren extends Movie {
    public static final int THREE = 3;
    public static final float FACTOR = 1.5f;

    /**
     *
     * @param title title of movie.
     */
    public MovieChildren(final String title) {
        super(title);
        setpriceCode(PriceCode.CHILDRENS);
    }

    /**
     *
     * @param nDays days rented.
     * @return price.
     */
    @Override
    public float calculateAmount(int nDays) {
        float amount = getPriceCode().getValue();
        amount = nDays > THREE ? amount + (nDays - THREE) * FACTOR : amount;
        return amount;
    }
}
