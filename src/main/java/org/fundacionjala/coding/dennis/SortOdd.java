package org.fundacionjala.coding.dennis;

import java.util.ArrayList;
import java.util.Collections;

/**
 * With an integer list, sort the odd numbers while even numbers remains in their positions.
 */
public final class SortOdd {

    private static final int TWO = 2;
    private static ArrayList<Integer> oddList;

    /**
     * Constructor.
     */
    private SortOdd() {

    }

    /**
     *
     * @param array array of integers.
     * @return array of integers with only odd numbers sorted.
     */
    public static int[] sortArray(final int[] array) {
        int[] finalList = new int[array.length];
        oddList = new ArrayList<>(1);
        for (int number : array) {
            oddList.add(number);
        }
        oddList.removeIf(num -> num % TWO == 0);
        Collections.sort(oddList);
        Collections.reverse(oddList);
        for (int index = 0; index < array.length; index++) {
            finalList[index] = oddList.contains(array[index]) ? getOdd() : array[index];
        }
        return finalList;
    }

    /**
     * Return the odd number of the list and rotate for next number.
     * @return an odd number.
     */
    private static int getOdd() {
        int oddNumber = oddList.get(oddList.size() - 1);
        Collections.rotate(oddList, 1);
        return oddNumber;
    }
}
