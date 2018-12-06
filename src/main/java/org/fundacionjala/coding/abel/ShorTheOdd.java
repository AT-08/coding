package org.fundacionjala.coding.abel;

/**
 * Shor the odd.
 * You have an array of numbers.
 * Your task is to sort ascending odd numbers but even numbers must be on their places.
 * Zero isn't an odd number and you don't need to move it. If you have an empty array, you need to return it.
 * Example:
 * sortArray([5, 3, 2, 8, 1, 4]) == [1, 3, 2, 8, 5, 4]
 */
public class ShorTheOdd {
    /**
     * coonstructor.
     */
    public ShorTheOdd() {
    }

    /**
     * This Method sort ascending odd numbers but even numbers must be on their places.
     *
     * @param array parameter of input.
     * @return array ordered integer type.
     */
    public int[] sortArray(final int[] array) {
        for (int i = 0; i < array.length; i++) {
            int aux = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j] && array[i] % 2 != 0 && array[j] % 2 != 0) {
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }
        return array;
    }
}



