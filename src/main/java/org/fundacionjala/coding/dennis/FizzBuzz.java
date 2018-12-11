package org.fundacionjala.coding.dennis;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public  final class FizzBuzz {

    public static final int THREE = 3;
    public static final int FIVE = 5;
    public static final int MCM = THREE * FIVE;

    /**
     *
     */
    private FizzBuzz() {
    }

    /**
     *
     * @param number numero a ser evaluado.
     * @return cadena resultado.
     */
    public static String singleFizzBuzz(int number) {
        String stringResultFizzBuzz = Integer.toString(number);
        CharSequence three = "3";
        CharSequence five = "5";
        if (number % MCM == 0) {
            return "FizzBuzz";
        }
        if (number % THREE == 0 || stringResultFizzBuzz.contains(three)) {
            return "Fizz";
        }
        if (number % FIVE == 0 || stringResultFizzBuzz.contains(five)) {
            return "Buzz";
        }
        return stringResultFizzBuzz;
    }

    /**
     *
     * @param limit cantidad maxima de elementos en lista.
     * @return Lista de los elementos devueltos.
     */
    public static List<String> listFizzBuzz(int limit) {
        List<String> listFizzBuzz = new ArrayList<>();
        for (int num = 1; num <= limit; num++) {
            listFizzBuzz.add(singleFizzBuzz(num));
        }
        return listFizzBuzz;
    }
}
