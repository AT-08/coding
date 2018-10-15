package org.fundacionjala.coding.abel;

/**
 *
 */
public class FizzBuzz {

    private static final int FIZZ_NUM = 3;
    private static final int BUZZ_NUM = 5;
    private static final int FIZZBUZZ_NUM = 15;
    private static final String FIZZBUZZ = "FizzBuzz";
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final int LENGTH = 100;


    /**
     * @param indice vaue of input
     * @return value return
     */
    public String fizzBuzz2(int indice) {
        String[] container = generated2();
        return container[indice - 1];
    }

    /**
     * @return value of return
     */
    public String[] generated2() {
        String[] a = new String[LENGTH];
        int cont = 0;
        for (int i = 1; i <= LENGTH; i++) {

            if (i % FIZZBUZZ_NUM == 0) {
                a[cont] = FIZZBUZZ;
            } else if (i % FIZZ_NUM == 0 || String.valueOf(i).contains("3")) {
                a[cont] = FIZZ;
            } else if (i % BUZZ_NUM == 0 || String.valueOf(i).contains("5")) {
                a[cont] = BUZZ;
            } else {
                a[cont] = String.valueOf(i);
            }
            cont++;
        }
        return a;
    }
}
