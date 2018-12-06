package org.fundacionjala.coding.dennis;

import java.util.StringJoiner;

/**
 *
 */
public final class SpinString {

    public static final int LIMIT = 5;

    /**
     *
     */
    private SpinString() {
    }

    /**
     *
     * @param st cadena
     * @return cadena
     */
    public static String spinningString(final String st) {
        StringJoiner sJoiner = new StringJoiner(" ");
        String[] words = st.split(" ");
        for (String word : words) {
            sJoiner.add(word.length() >= LIMIT ? new StringBuilder(word).reverse().toString() : word);
        }
        return sJoiner.toString();
    }
}
