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
            for (int i = 0; i < parts.length; i++) {
                sb.append(!parts[i].isEmpty() ? parts[i]
                        .replaceFirst(parts[i].substring(0, 1), parts[i]
                                .toUpperCase()
                                .substring(0, 1)) : "");
            }
        }
        return sb.toString();
    }
}
