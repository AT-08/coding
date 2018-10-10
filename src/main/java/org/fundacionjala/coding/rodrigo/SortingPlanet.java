package org.fundacionjala.coding.rodrigo;


import java.util.Arrays;

/**
 * #The values of the digits 3 and 7 are twisted. Our 3 means 7 on the planet Twisted-3-7. And 7 means 3.
 * Your task is to create a method, that can sort an array the way it would be sorted on Twisted-3-7.
 */
public class SortingPlanet {

    /**
     * @param array input array.
     * @return sort3'7.
     */
    public int[] sortTwisted37(final Integer[] array) {
        return Arrays.stream(array)
                .mapToInt(SortingPlanet::replace37)
                .sorted()
                .map(SortingPlanet::replace37).toArray();
    }

    /**
     * Replace the 3 for 7 or whatever.
     *
     * @param number Input number for replace.
     * @return the replaced number.
     */
    private static int replace37(final int number) {
        String numStr = String.valueOf(number)
                .replace('7', '?')
                .replace('3', '7')
                .replace('?', '3');
        return Integer.parseInt(numStr);
    }

}
