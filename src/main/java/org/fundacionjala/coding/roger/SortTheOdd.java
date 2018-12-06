package org.fundacionjala.coding.roger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * You have an array of numbers.
 * Your task is to sort ascending odd numbers but even numbers must be on their places. *
 * Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.
 */
public final class SortTheOdd {

    /**
     * Empty constructor.
     */
    private SortTheOdd() {
    }

    /**
     *
     * @param array an array of numbers.
     * @return an sorted array.
     */
    public static int[] sortArray(final int[] array) {
        List<Integer> listImp = obtainImpar(array);
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                 array[i] = listImp.get(cont);
                cont++;
            }
        }
        return array;
    }

    /**
     *
     * @param array array of numbers.
     * @return an impar sorted array.
     */
    public static List<Integer> obtainImpar(final int[] array) {
        List<Integer> listImp = new ArrayList<Integer>();
        for (int i : array) {
            if (i % 2 != 0) {
                listImp.add(i);
            }
        }
        Collections.sort(listImp);
        return listImp;
    }
}
