package org.fundacionjala.coding.rodrigo;

/**
 * Magnet particules in boxes.
 * https://www.codewars.com/kata/magnet-particules-in-boxes
 */
final class Magnets {
    /**
     * Empty constructor.
     */
    private Magnets() {
    }

    /**
     * This is the method who solve the magnets with sigma operator.
     *
     * @param maxk the upper limit of k.
     * @param maxn the upper limit of n.
     * @return the total summation.
     */
    public static double doubles(int maxk, int maxn) {
        double sum = 0;
        for (int k = 1; k <= maxk; k++) {
            for (int n = 1; n <= maxn; n++) {
                double den = (k * Math.pow((n + 1), (double) 2 * k));
                sum += 1 / den;
            }
        }
        return sum;
    }
}
