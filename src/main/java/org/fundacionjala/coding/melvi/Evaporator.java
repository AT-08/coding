package org.fundacionjala.coding.melvi;

/**
 * This program tests the life of an evaporator containing a gas.
 * <p>
 * We know the content of the evaporator (content in ml),
 * the percentage of foam or gas lost every day (evap_per_day)
 * and the threshold (threshold) in percentage beyond which the
 * evaporator is no longer useful. All numbers are strictly positive.
 * <p>
 * The program reports the nth day (as an integer) on which the
 * evaporator will be out of use.
 * <p>
 * Note : Content is in fact not necessary in the body of the
 * function "evaporator", you can use it or not use it, as you
 * wish. Some people might prefer to reason with content, some
 * other with percentages only. It's up to you but you must keep
 * it as a parameter because the tests have it as an argument.
 */

public final class Evaporator {
    /**
     *
     */
    public static final int CIEN = 100;

    /**
     *
     */
    private Evaporator() {

    }

    /**
     * @param evapPerDay the initial value evap_per_day
     * @param threshold    for value threshold initial
     * @return num days
     */
    public static int evaporator(double evapPerDay, double threshold) {
        // your code
        double percentage = CIEN;
        int days = 0;
        while (percentage > threshold) {
            percentage -= percentage * (evapPerDay / CIEN);
            days++;
        }
        return days;

    }
}
