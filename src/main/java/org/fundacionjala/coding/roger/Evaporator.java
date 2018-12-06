package org.fundacionjala.coding.roger;
/**
 * Kata 2
 * by Roger.
 *
 */
public class Evaporator {
    private static final int ONEHUNDRED = 100;
    /**
     *@param content input Double.
     *@param evapPerDay input Double.
     *@param threshold input Double.
     *@return int days.
     */
    public int evaporator(final double content, final double evapPerDay, final double threshold) {
        double contentDay = content;
        int days = 0;
        while (contentDay > (content * threshold / ONEHUNDRED)) {
            contentDay -= contentDay * (evapPerDay / ONEHUNDRED);
            days++;
        }
        return days;
    }
}
