package org.fundacionjala.coding.wilson;

/**
 *
 */
public final class SortTheOdd {

    /**
     *
     */
    private SortTheOdd() {
    }

    /**
     *
     * @param array with numbers
     * @return sort the odd array
     */
    public static int[] sortArray(final int[] array) {
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
        return  array;
    }
}
