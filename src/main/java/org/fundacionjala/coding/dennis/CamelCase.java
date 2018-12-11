package org.fundacionjala.coding.dennis;

/**
 *
 */
public final class CamelCase {

    /**
     *
     */
    private CamelCase() {
    }

    /**
     *
     * @param st cadena de ingreso
     * @return cadena camelcase
     */
    public static String camelCase(final String st) {
        String[] words = st.split(" ");
        StringBuilder sb = new StringBuilder(1);
        for (String word : words) {
            sb.append(!word.isEmpty() ? word
                    .replaceFirst(word.substring(0, 1),
                            word.toUpperCase().substring(0, 1)) : "");
        }
        return sb.toString();
    }
}
