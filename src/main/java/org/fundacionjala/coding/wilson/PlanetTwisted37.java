package org.fundacionjala.coding.wilson;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 */
public final class PlanetTwisted37 {

    /**
     *
     * @param array Array with integers
     * @return Integer[]
     */
    public  Integer[] sortTwisted37(final Integer[] array) {
        Integer[] sortedArray = Arrays.copyOf(array, array.length);
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = planetValue(sortedArray[i]);
        }
        Arrays.sort(sortedArray, Comparator.naturalOrder());
        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = planetValue(sortedArray[i]);
        }
        return sortedArray;
    }

    /**
     * @param i is a integer
     * @return value
     */
    public static int planetValue(final int i) {
        String value = String.valueOf(i)
                .replace('3', 'x')
                .replace('7', '3')
                .replace('x', '7');
        return  Integer.parseInt(value);
    }
}

