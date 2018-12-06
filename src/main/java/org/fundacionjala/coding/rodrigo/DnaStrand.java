package org.fundacionjala.coding.rodrigo;

import java.util.HashMap;
import java.util.Map;

/**
 * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G".
 * You have function with one side of the DNA (string, except for Haskell);
 * you need to get the other complementary side.
 * DNA strand is never empty or there is no DNA at all (again, except for Haskell).
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
     * Constructor empty.
     */
    private DnaStrand() {
    }

    /**
     * @param dna the String input.
     * @return The complementary DNA.
     */
    public static String makeComplement(final String dna) {
        char[] characters = dna.toCharArray();
        StringBuilder dnaComplementary = new StringBuilder();
        for (char character : characters) {
            dnaComplementary.append(DNA_MAP.get(character));
        }
        return dnaComplementary.toString();
    }
}
