package org.fundacionjala.coding.roger;

import java.util.StringJoiner;
/**
 * Kata 8 by roger.
 *
 */
public class FizzBuzz {

    /**
     *@param number input String.
     *@return return the string.
     */
    public String fizzBuzzNumbers(final int number) {
        StringJoiner sj = new StringJoiner("\n");
        for (int i = 0; i < number; i++) {
            sj.add(fizzBuzzNumber(i + 1));
        }
        return sj.toString();
    }
    /**
     *@param num input String.
     *@return return the string.
     */
    public String fizzBuzzNumber(final int num) {
        final int five = 5;
        final int three = 3;
        final int fifteen = 15;
        if (num % fifteen == 0) {
            return "FizzBuzz";
        }
        String numberString = String.valueOf(num);
        if (num % three == 0 || numberString.contains("3")) {
            return "Fizz";
        }

        if (num % five == 0 || numberString.contains("5")) {
            return "Buzz";
        }

        return numberString;
    }
}
