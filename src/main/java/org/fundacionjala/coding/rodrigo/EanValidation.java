package org.fundacionjala.coding.rodrigo;

import java.util.stream.IntStream;

/**
 * For example, calculate the checksum for "400330101839" (= 12-digits data):
 * <p>
 * 4·1 + 0·3 + 0·1 + 3·3 + 3·1 + 0·3 + 1·1 + 0·3 + 1·1 + 8·3 + 3·1 + 9·3
 * = 4 + 0 + 0 + 9 + 3 + 0 + 1 + 0 + 1 + 24 + 3 + 27
 * = 72
 * 10 - (72 mod 10) = 8 ⇒ Checksum: 8
 * <p>
 * Thus, the EAN-Code is 4003301018398 (= 12-digits data followed by single-digit checksum).
 */
public final class EanValidation {
    /**
     * Checksum validation.
     *
     * @param eanCode input.
     * @return if it is valid.
     */
    public boolean validate(final String eanCode) {
        final int ten = 10;
        final int three = 3;
        String[] aux = eanCode.substring(0, eanCode.length() - 1).split("");
        int odd = IntStream.range(0, aux.length)
                .filter(i -> i % 2 == 0)
                .map(s -> Integer.parseInt(aux[s]))
                .sum();
        int even = IntStream.range(0, aux.length)
                .filter(i -> i % 2 != 0)
                .map(s -> Integer.parseInt(aux[s]) * three)
                .sum();
        int sum = even + odd;
        int checksum = sum % ten == 0 ? 0 : ten - sum % ten;
        return String.join("", aux).concat(String.valueOf(checksum)).equals(eanCode);
    }
}
