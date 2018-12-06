package org.fundacionjala.coding.abel;

import java.util.Arrays;

/**
 *
 */
public class SortingOnPlanetTwisted37 {
    /**
     * @param array arrary imput
     * @return value return
     */
    public Integer[] sortTwdd37(final Integer[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = inverted(array[i]);
        }
        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            array[i] = inverted(array[i]);
        }
        return array;
    }

    /**
     * @param integer value input
     * @return value ouput
     */
    private Integer inverted(final Integer integer) {
        String string = String.valueOf(integer)
                .replaceAll("3", "x")
                .replaceAll("7", "3")
                .replaceAll("x", "7");
        return Integer.parseInt(string);
    }


}
