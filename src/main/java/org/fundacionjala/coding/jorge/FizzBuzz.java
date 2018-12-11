package org.fundacionjala.coding.jorge;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 */
public final class FizzBuzz {

    /**
     * The first part.
     *
     * @param rango int[]
     * @return Object[]
     */
    public String fizzBuzz(final int[] rango) {
        return IntStream.rangeClosed(rango[0], rango[1]).mapToObj(FizzBuzz::changeFB1).collect(Collectors.joining(" "));

    }


    /**
     * @param number to evaluate 3 or 5.
     * @return return the arrayObj.
     */
    private static String changeFB1(final int number) {
        final int fizz = 3;
        final int buzz = 5;
        final int fizzBuzz = fizz * buzz;
        if (number % fizzBuzz == 0) {
            return "FizzBuzz";
        }
        final String numberAsString = String.valueOf(number);
        if (number % buzz == 0 || numberAsString.contains("5")) {
            return "Buzz";
        }
        if (number % fizz == 0 || numberAsString.contains("3")) {
            return "Fizz";
        }
        return numberAsString;
    }
}
