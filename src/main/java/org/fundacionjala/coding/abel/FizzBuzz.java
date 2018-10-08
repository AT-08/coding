package org.fundacionjala.coding.abel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class FizzBuzz {

    private static final int FIZZ_NUM = 3;
    private static final int BUZZ_NUM = 5;
    private static final String FIZZBUZZ = "FizzBuzz";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final int LENGTH = 100;

    /**
     * @return value of return
     */
    public List<String> fizzbuzz() {
        List<String> list = new ArrayList<String>();
        for (int i = 1; i <= LENGTH; i++) {
            list.add(i % FIZZ_NUM == 0 && i % BUZZ_NUM == 0 ? FIZZBUZZ
                    : i % FIZZ_NUM == 0 ? FIZZ
                    : i % BUZZ_NUM == 0 ? BUZZ
                    : String.valueOf(i));
        }
        return list;
    }

    /**
     *
     * @return VALUE OF RETURN
     */
    public List<String> fizzBuzz2() {
        List<String> list = new ArrayList<String>();
        final int num1 = 53;
        final int num2 = 35;
        final int num3 = 0;
        for (int i = 1; i <= LENGTH; i++) {

            list.add(i == num1 || i == num2 ? FIZZBUZZ
                    : i % FIZZ_NUM == num3 || String.valueOf(i).contains("3") ? FIZZ
                    : i % FIZZ_NUM == num3 || String.valueOf(i).contains("5") ? BUZZ
                    : String.valueOf(i));
        }
        return list;
    }
}
