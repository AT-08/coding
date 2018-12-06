package org.fundacionjala.coding.melvi;

import java.util.Arrays;
import java.util.Comparator;

/**
 * #Sorting on planet Twisted-3-7
 * <p>
 * There is a planet... in a galaxy far far away. It is exactly like our planet, but it has one difference:
 * <p>
 * #The values of the digits 3 and 7 are twisted. Our 3 means 7 on the planet Twisted-3-7. And 7 means 3.
 * <p>
 * Your task is to create a method, that can sort an array the way it would be sorted on Twisted-3-7.
 * <p>
 * 7 Examples from a friend from Twisted-3-7:
 * <p>
 * [1,2,3,4,5,6,7,8,9] -> [1,2,7,4,5,6,3,8,9]
 * [12,13,14] -> [12,14,13]
 * [9,2,4,7,3] -> [2,7,4,3,9]
 * There is no need for a precheck. The array will always be not null and will always contain at least one number.
 * <p>
 * You should not modify the input array!
 * <p>
 * Have fun coding it and please don't forget to vote and rank this kata! :-)
 * <p>
 * I have also created other katas. Take a look if you enjoyed this kata!
 */
public final class Twisted37 {

    /**
     *
     */
    private Twisted37() {

    }

    /**
     * @param sortedArray array to be sorted
     * @return sorted array
     */
    public static Integer[] sortTwisted37(final Integer[] sortedArray) {

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
     * @param i original value
     * @return value on the planet
     */
    public static int planetValue(int i) {

        String value = String.valueOf(i)
                .replace('3', 'x')
                .replace('7', '3')
                .replace('x', '7');

        return Integer.parseInt(value);
    }
}
