package org.fundacionjala.coding.abel;


/**
 *
 */
public class HighestAndLowest {

    /**
     * @param numbers sdfsd
     * @return sdfsd
     */

    public String highAndLow(final String numbers) {
        String[] container = numbers.split(" ");
        int mini = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (String aContainer : container) {
            int num = Integer.parseInt(aContainer);
            if (num < mini) {
                mini = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return String.format("%d %d", max, mini);
    }
}
