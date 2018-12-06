package org.fundacionjala.coding.wilson;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public final class Dna {
    /**
     *
     */
    private Dna() {

    }

    /**
     *
     * @param dna Given type String
     * @return chars String
     */
    public static String makeComplement(final String dna) {
        char[] arrayChar = dna.toCharArray();
        StringBuilder dnaComplementary = new StringBuilder();
        for (char ch : arrayChar) {
            dnaComplementary.append(DNA.get(ch));
        }
        return dnaComplementary.toString();
    }

    /**
     *
     * @param c is char
     * @return change
     */
    private static final Map<Character, Character> DNA = new HashMap<>();
    static {
        DNA.put('A', 'T');
        DNA.put('T', 'A');
        DNA.put('C', 'G');
        DNA.put('G', 'C');
    }

}
