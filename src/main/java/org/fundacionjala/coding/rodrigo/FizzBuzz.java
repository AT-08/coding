package org.fundacionjala.coding.rodrigo;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Write a program that prints the numbers from 1 to 100. But for multiples of three print Fizz instead
 * of the number and for the multiples of five print Buzz. For numbers which are multiples of both three
 * and five print FizzBuzz.
 */
public final class FizzBuzz {
    /**
     * @param number quantity of print numbers
     * @return The whole String
     */
    public String fizzBuzz(final int number) {
        return IntStream.rangeClosed(1, number).mapToObj(FizzBuzz::changeFB)
                .collect(Collectors.joining("\n"));
    }

    /**
     * @param number Number to evaluate 3 or 5.
     * @return return the number converted.
     */
    public static String changeFB(final int number) {
        final int fizz = 3;
        final int buzz = 5;
        if (number % (fizz * buzz) == 0) {
            return "FizzBuzz";
        }
        String numberAsString = String.valueOf(number);
        if (number % fizz == 0 || numberAsString.contains("3")) {
            return "Fizz";
        }
        if (number % buzz == 0 || numberAsString.contains("5")) {
            return "Buzz";
        }
        return numberAsString;
    }

}
