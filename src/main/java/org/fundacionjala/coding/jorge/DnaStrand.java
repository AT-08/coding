package org.fundacionjala.coding.jorge;

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public final class DnaStrand {
    private static final Map<Character, Character> DNA_MAP = new HashMap<>();
    static {
        DNA_MAP.put('A', 'T');
        DNA_MAP.put('T', 'A');
        DNA_MAP.put('C', 'G');
        DNA_MAP.put('G', 'C');
    }
    /**
     *
     */
    private DnaStrand() {
    }

    /**
     * @param dna given type String
     * @return cadDna given type String
     * @serialData cadDna type String
     * @serialData arrayDna
     */
    public static String makeComplement(final String dna) {
        char[] arrayChar = dna.toCharArray();
        StringBuilder dnaComplementary = new StringBuilder();
        for (char ch : arrayChar) {
            dnaComplementary.append(DNA_MAP.get(ch));
        }
        return dnaComplementary.toString();
    }
}
