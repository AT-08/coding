package org.fundacionjala.coding.jorge;

import java.util.StringJoiner;

/**
 *
 */
public final class SpinWords {
    /**
     *
     */
    private SpinWords() {
    }

    /**
     * @param sentence given type String
     * @return given type StringBuilder
     */
    public static String spinWords(final String sentence) {
        StringJoiner sJ = new StringJoiner(" ");
        String[] arrayString = sentence.split(" ");
        final int limit = 4;
        for (String st : arrayString) {
            sJ.add(st.length() >= limit ? new StringBuilder(st).reverse().toString() : st);
        }
        return sJ.toString();
    }
}
