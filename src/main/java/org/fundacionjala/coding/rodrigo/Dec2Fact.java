package org.fundacionjala.coding.rodrigo;

/**
 * Kata of Decimal to Factorial.
 * https://www.codewars.com/kata/decimal-to-factorial-and-back
 */
public class Dec2Fact {
    public static String dec2FactString(final long nb) {
        int c = 0;
        long x = nb;
        int result = 0;
        while (x > 0) {
            c++;
            result += (int) (x % c) * Math.pow(10, c - 1);
            x /= c;
        }
        return String.valueOf(result);
    }

    public static long factString2Dec(final String str) {
        int numDec = 0;
        String[] numbers = str.split("");
        for (int i = 0; i < numbers.length; i++) {
            numDec += Integer.parseInt(numbers[i]) * factorialOf(numbers.length - i);
        }
        return numDec;
    }

    private static int factorialOf(int number) {
        if (number == 0) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i < number; i++) {
            result *= i;
        }
        return result;
    }
}
