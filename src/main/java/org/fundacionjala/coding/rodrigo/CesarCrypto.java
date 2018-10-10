package org.fundacionjala.coding.rodrigo;

/**
 * Cifrado Cesar.
 */
public final class CesarCrypto implements Encryption {
    @Override
    public String encode(final String message, final String key) {
        char[] parts = message.trim().toUpperCase().replaceAll("[^a-zA-Z0]", "").toCharArray();
        int keyI = Integer.parseInt(key);
        StringBuilder codEnc = new StringBuilder();
        if (keyI == 0 || keyI < 0) {
            return message;
        }
        if (!message.isEmpty()) {
            for (char item : parts) {
                codEnc.append(rotation(item, keyI));
            }
        }
        return codEnc.toString();
    }

    @Override
    public String decode(final String message, final String key) {
        char[] parts = message.trim().toUpperCase().replaceAll("[^a-zA-Z0]", "").toCharArray();
        int keyI = Integer.parseInt(key);
        StringBuilder codEnc = new StringBuilder();
        if (keyI == 0 || keyI > 0) {
            return message;
        }
        if (!message.isEmpty()) {
            for (char item : parts) {
                codEnc.append(rotation(item, keyI));
            }
        }
        return codEnc.toString();
    }

    @Override
    public char rotation(char item, int key) {
        int charnumber = item + key;
        if (charnumber >= 'Z') {
            int diff = charnumber - 'Z';
            return (char) (diff + '@');
        }
        if (charnumber <= 'A') {
            int diff = charnumber - 'A';
            return (char) ('[' + diff);
        }
        return (char) charnumber;
    }
}
