package org.fundacionjala.coding.wilson;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 */
public final class KataFizzBuzz {

    /**
     *
     * @param num a
     * @return a result
     */
    public String fizzBuzz(final int num) {
        return IntStream.rangeClosed(1, num).mapToObj(KataFizzBuzz::sendString)
                .collect(Collectors.joining("\n"));
    }

    /**
     *
     * @param num b
     * @return fizz buzz fizzbuzz
     */
    public static String sendString(final int num) {
        final int fizz = 3;
        final int buzz = 5;
        if (num % (fizz * buzz) == 0) {
            return "FizzBuzz";
        }
        String numberAsString = String.valueOf(num);
        if (num % fizz == 0 || numberAsString.contains("3")) {
            return "Fizz";
        }
        if (num % buzz == 0 || numberAsString.contains("5")) {
            return "Buzz";
        }
        return numberAsString;
    }
}
