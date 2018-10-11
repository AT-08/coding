package org.fundacionjala.coding.dennis;

/**
 *
 */
public interface Encrypto {

     /**
     *
     * @param key llave.
     * @param mess mensage.
     * @return Cadena codificada.
     */
    String crypto(String key, String mess);

    /**
     *
     * @param key llave.
     * @param encMess mensaje encriptado.
     * @return Cadena codificada.
     */
    String decrypto(String key, String encMess);

    /**
     *
     * @param pos posicion.
     * @param key llave.
     * @return reemplazo.
     */
    char getLetter(int pos, int key);
}
