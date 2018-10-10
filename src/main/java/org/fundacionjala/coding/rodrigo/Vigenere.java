package org.fundacionjala.coding.rodrigo;

import java.util.StringJoiner;

/**
 * Better encryptation than cesar.
 */
public final class Vigenere extends Encryption {
    /**
     * Vigenere encode.
     *
     * @param message Input message.
     * @param key     test message.
     * @return The codification.
     */
    public String encode(final String message, final String key) {
        String[] parts = message.trim().toUpperCase().split(" ");
        char[] keyPart = key.toUpperCase().toCharArray();
        StringJoiner joiner = new StringJoiner(" ");
        int count = 0;
        for (String item : parts) {
            char[] word = item.toCharArray();
            StringBuilder builder = new StringBuilder();
            for (char letter : word) {
                if (count >= keyPart.length) {
                    count = 0;
                }
                int partialkey = keyPart[count] - '@';
                builder.append(rotation(letter, partialkey));
                count++;
            }
            joiner.add(builder.toString());
        }
        return joiner.toString();
    }

    /**
     * Vigenere Decode.
     *
     * @param message Text input.
     * @param key     String key.
     * @return text deco.
     */
    public String decode(final String message, final String key) {
        String[] parts = message.trim().toUpperCase().split(" ");
        char[] keyPart = key.toUpperCase().toCharArray();
        StringJoiner joiner = new StringJoiner(" ");
        int count = 0;
        for (String item : parts) {
            char[] word = item.toCharArray();
            StringBuilder builder = new StringBuilder();
            for (char letter : word) {
                if (count >= keyPart.length) {
                    count = 0;
                }
                int partialkey = keyPart[count] - '@';
                builder.append(rotation(letter, -partialkey));
                count++;
            }
            joiner.add(builder.toString());
        }
        return joiner.toString();
    }

    @Override
    public char rotation(final char item, final int key) {
        int charnumber = item + key;
        if (charnumber >= 'Z') {
            int diff = charnumber - 'Z';
            charnumber = diff + '@';
        }
        if (charnumber <= 'A') {
            int diff = charnumber - 'A';
            charnumber = '[' + diff;
        }
        return (char) charnumber;
    }
}
