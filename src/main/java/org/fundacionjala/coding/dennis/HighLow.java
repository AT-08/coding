package org.fundacionjala.coding.dennis;


import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 */
public final class HighLow {

    /**
     *
     */
    private HighLow() {

    }

    /**
     *
     * @param numbers Cadena.
     * @return cadena de 2 elementos.
     */
    public static String hal(final String numbers) {
        ArrayList<Integer> digitArray = new ArrayList<>();
        for (String dString : numbers.split(" ")) {
            digitArray.add(Integer.parseInt(dString));
        }
        digitArray.sort(Comparator.naturalOrder());
        return String.format("%d %d", digitArray.get(digitArray.size() - 1), digitArray.get(0));
    }
}
