package org.fundacionjala.coding.jorge;

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
     * @param str given type String
     * @return given type StringBuilder
     * @serialData sb
     */
    public static String camelCase(final String str) {
        StringBuilder sb = new StringBuilder();
        String[] parts = str.split(" ");
        if (str.length() != 0) {
            for (String part : parts) {
                sb.append(!part.isEmpty() ? part
                        .replaceFirst(part.substring(0, 1), part
                                .toUpperCase()
                                .substring(0, 1)) : "");
            }
        }
        return sb.toString();
    }
}
