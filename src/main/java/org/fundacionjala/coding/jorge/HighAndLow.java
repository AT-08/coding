package org.fundacionjala.coding.jorge;

import java.util.Arrays;
/**
 * kata highest and lowest number.
 */
public final class HighAndLow {
    /**
     *
     */
    private HighAndLow() {
    }
    /**
     * @param numbers is a type string.
     * @return get value String,
     */
    public static String highAndLow(final String numbers) {
        int[] num = Arrays.stream(numbers.split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        return String.format("%d %s", num[num.length - 1], num[0]);
    }

}
