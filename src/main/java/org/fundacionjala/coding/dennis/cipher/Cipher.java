package org.fundacionjala.coding.dennis.cipher;

/**
 *
 */
public interface Cipher {

     /**
     *
     * @param key llave.
     * @param mess mensage.
     * @return Cadena codificada.
     */
    String encode(String key, String mess);

    /**
     *
     * @param key llave.
     * @param encMess mensaje encriptado.
     * @return Cadena codificada.
     */
    String decode(String key, String encMess);

    /**
     *
     * @param pos posicion.
     * @param key llave.
     * @return reemplazo.
     */
    char getLetter(int pos, int key);
}
