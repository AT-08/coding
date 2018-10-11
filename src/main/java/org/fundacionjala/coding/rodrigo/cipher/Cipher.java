package org.fundacionjala.coding.rodrigo.cipher;

/**
 * Abstract class.
 */
interface Cipher {
    /**
     * @param message input message.
     * @param key     num rot.
     * @return encode msg.
     */
    String encode(String message, String key);

    /**
     * @param message input msg.
     * @param key     num rot.
     * @return decode msg.
     */
    String decode(String message, String key);

    /**
     * @param item input.
     * @param key  rotation.
     * @return correct char.
     */
    char rotation(char item, int key);
}
