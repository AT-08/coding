package org.fundacionjala.coding.abel;
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
     * @param indicadio indicador de entrada
     * @return value if return
     */
    public String fizzBuzz(int indicadio) {
        String[] container = generated();
        return container[indicadio - 1];
    }

    /**
     * @return value og return
     */
    public String[] generated() {
        String[] a = new String[LENGTH];
        int cont = 0;
        for (int i = 1; i <= LENGTH; i++) {
            if (i % FIZZ_NUM == 0 && i % BUZZ_NUM == 0) {
                a[cont] = FIZZBUZZ;
            } else if (i % FIZZ_NUM == 0) {
                a[cont] = FIZZ;
            } else if (i % BUZZ_NUM == 0) {
                a[cont] = BUZZ;
            } else {
                a[cont] = String.valueOf(i);
            }
            cont++;
        }
        return a;
    }

    /**
     * @param indicadio vaue of input
     * @return value return
     */
    public String fizzBuzz2(int indicadio) {

        String[] container = generated2();

        return container[indicadio - 1];


    }

    /**
     * @return value of return
     */
    public String[] generated2() {
        String[] a = new String[LENGTH];
        int cont = 0;
        for (int i = 1; i <= LENGTH; i++) {
            if (i % FIZZ_NUM == 0 || String.valueOf(i).contains("3")) {
                a[cont] = FIZZ;
            } else if (i % FIZZ_NUM == 0 || String.valueOf(i).contains("5")) {
                a[cont] = BUZZ;
            } else {
                a[cont] = String.valueOf(i);
            }
            cont++;
        }
        return a;
    }
}
