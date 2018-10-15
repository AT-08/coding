package org.fundacionjala.coding.melvi;

import java.util.Arrays;

/**
 * In this little assignment you are given a string
 * of space separated numbers, and have to return
 * the highest and lowest number.
 * <p>
 * Example:
 * <p>
 * HighAndLow("1 2 3 4 5") // return "5 1"
 * HighAndLow("1 2 -3 4 5") // return "5 -3"
 * HighAndLow("1 9 3 4 -5") // return "9 -5"
 * Notes:
 * <p>
 * All numbers are valid Int32, no need to validate them.
 * There will always be at least one number in the input
 * string.
 * Output string must be two numbers separated by a single
 * space, and highest number is first.
 */
public final class Kata {
    /**
     *
     */
    private Kata() {
    }

    /**
     * @param numbers number entry
     * @return max and min value
     */
    static String highAndLow(final String numbers) {
        // Code here or
        Integer[] arr = Arrays.stream(numbers.split(" "))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);
        int max = arr[arr.length - 1];
        int min = arr[0];
        return String.format("%d %d", max, min);
    }

}
