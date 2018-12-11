package org.fundacionjala.coding.jorge;

/**
 *
 */
public class DeodorantEvaporator {

    /**
     * @param content type double.
     * @param evapPerDay type double.
     * @param threshold    type double.
     * @return int vowels count.
     */
    public int evaporator(double content, double evapPerDay, double threshold) {
        final double valuePorcet = 100;
        double contentMod = content;
        int n = 0;
        double end = contentMod * (threshold / valuePorcet);
        while (contentMod >= end) {
            n++;
            contentMod *= 1 - (evapPerDay / valuePorcet);
        }
        return n;
    }
}
