package org.fundacionjala.coding.dennis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

/**
 *
 * @author DennisMont
 *
 */
public final class SortInner {

    public static final int LIMIT = 3;

    /**
     *
     */
    private SortInner() {
    }

    /**
     *
     * @param st cadena
     * @return cadena
     */
    public static String sortInner(final String st) {
        String[] words = st.split(" ");
        StringJoiner sj = new StringJoiner(" ");
        for (String word : words) {
            sj.add(word.length() > LIMIT ? word.substring(0, 1)
                    .concat(inverseOrder(word.substring(1, word.length() - 1)))
                    .concat(word.substring(word.length() - 1)) : word);
        }
        return sj.toString();
    }

    /**
     *
     * @param inner cadena
     * @return cadena
     */
    public static String inverseOrder(final String inner) {
        List<String> arrayChar = Arrays.asList(inner.split(""));
        arrayChar.sort(Collections.reverseOrder());
        return arrayChar.toString().replaceAll("[^a-zA-Z]", "");
    }
}
