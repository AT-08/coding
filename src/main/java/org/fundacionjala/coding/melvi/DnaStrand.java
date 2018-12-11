package org.fundacionjala.coding.melvi;

/**
 * Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions"
 * for the development and functioning of living organisms.
 * <p>
 * If you want to know more http://en.wikipedia.org/wiki/DNA
 * <p>
 * In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function
 * with one side of the DNA (string, except for Haskell); you need to get the other complementary side.
 * DNA strand is never empty or there is no DNA at all (again, except for Haskell).
 */
public final class DnaStrand {
    /**
     * constructor.
     */
    private DnaStrand() {

    }

    /**
     * change dna.
     *
     * @param dna parameter
     * @return dna strand
     */
    public static String makeComplement(final String dna) {
        //Your code
        return dna.replace('A', 'X')
                .replace('T', 'A')
                .replace('X', 'T')
                .replace('C', 'X')
                .replace('G', 'C')
                .replace('X', 'G');

    }

}

