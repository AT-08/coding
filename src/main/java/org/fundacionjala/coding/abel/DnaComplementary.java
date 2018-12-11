package org.fundacionjala.coding.abel;

/**
 *
 */
public final class DnaComplementary {
    /**
     *
     */
    private DnaComplementary() {

    }

    /**
     * @param dna String imput
     * @return value return
     */
    protected static String makeComplement(final String dna) {
        return dna.replaceAll("A", "t")
                .replaceAll("T", "a")
                .replaceAll("C", "g")
                .replaceAll("G", "c")
                .toUpperCase();
    }
}
