package org.fundacionjala.coding.dennis;

import java.util.Arrays;

/**
 *
 */
public final class Twist37 {
    /**
     *
     */
    private Twist37() {
    }

    /**
     *
     * @param array Arreglo de enteros
     * @return Integer[]
     */
    public static Integer[] sortTwisted37(final Integer[] array) {
        Integer[] tw = twist(array);
        Arrays.sort(tw);
        return twist(tw);
    }

    /**
     *
     * @param iArray Arreglo de enteros
     * @return Arreglo
     */
    public static Integer[] twist(final Integer[] iArray) {
        for (int pt = 0; pt < iArray.length; pt++) {
            String cad = String.valueOf(iArray[pt])
                    .replaceAll("3", "a")
                    .replaceAll("7", "3")
                    .replaceAll("a", "7");
            iArray[pt] =  Integer.parseInt(cad);
        }
        return iArray;
    }
}
