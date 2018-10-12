package org.fundacionjala.coding.roger;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Kata 7 Planet twisted.
 * by Roger.
 * There is a planet... in a galaxy far far away. It is exactly like our planet, but it has one difference:
 * The values of the digits 3 and 7 are twisted. Our 3 means 7 on the planet Twisted-3-7. And 7 means 3.
 * Your task is to create a method, that can sort an array the way it would be sorted on Twisted-3-7.
 *
 */
public class PlanetTwisted {


    /**
     * @param array Integer[].
     * @return Integer[] result.
     */

    public Integer[] sortTwisted37(final Integer[] array) {
        return Arrays.stream(array).sorted(Comparator.comparingInt(i -> Integer.valueOf(String.valueOf(i)
                .replace('3', 'x')
                .replace('7', '3')
                .replace('x', '7'))))
                .toArray(Integer[]::new);
    }
}
