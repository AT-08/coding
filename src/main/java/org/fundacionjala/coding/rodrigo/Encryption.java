package org.fundacionjala.coding.rodrigo;

/**
 * Abstract class.
 */
public abstract class Encryption {
    /**
     * @param message input message.
     * @param key     num rot.
     * @return encode msg.
     */
    public abstract String encode(String message, String key);

    /**
     * @param message input msg.
     * @param key     num rot.
     * @return decode msg.
     */
    public abstract String decode(String message, String key);

    /**
     * @param item input.
     * @param key  rotation.
     * @return correct char.
     */
    public abstract char rotation(char item, int key);
}
