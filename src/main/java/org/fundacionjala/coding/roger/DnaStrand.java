package org.fundacionjala.coding.roger;

import java.util.HashMap;
import java.util.Map;

/**
 * In DNA strings, symbols "A" and "T" are complements of each other,
 * as "C" and "G".
 *
 */

public final class DnaStrand {

    static final Map<Character, Character> COMPLEMENT = new HashMap<>();

    static {
        COMPLEMENT.put('A', 'T');
        COMPLEMENT.put('C', 'G');
        COMPLEMENT.put('G', 'C');
        COMPLEMENT.put('T', 'A');
    }

    /**
     * Empty constructor.
     */

    private DnaStrand() {
    }

    /**
     * Method make DNA Complementary .
     *
     * @param dna type String.
     * @return return a string with dna complementary.
     */

    public static String makeComplement(final String dna) {
        StringBuilder sb = new StringBuilder();
        for (char letter : dna.toCharArray()) {
            sb.append(COMPLEMENT.get(letter));
        }
        return sb.toString();
    }
}


