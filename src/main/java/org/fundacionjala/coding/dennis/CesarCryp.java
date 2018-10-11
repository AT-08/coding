package org.fundacionjala.coding.dennis;

import static org.fundacionjala.coding.dennis.Alphabet.ALPHAS;

/**
 *
 */
public class CesarCryp implements Encrypto {
    public static final int FIRSTPOS = 0;
    public static final int THEREISNO = -1;

    /**
     *
     * @param key llave.
     * @param mess mensage.
     * @return mensaje encriptado.
     */
    @Override
    public String crypto(final String key, final String mess) {
        int keyNum = Integer.parseInt(key);
        StringBuilder messCryp = new StringBuilder(1);
        for (char letter : mess.toCharArray()) {
            int pos = ALPHAS.indexOf(letter);
            letter = pos == THEREISNO ? letter : getLetter(pos, keyNum);
            messCryp.append(letter);
        }
        return messCryp.toString();
    }
    /**
     *
     * @param key llave.
     * @param encMess mensaje encriptado.
     * @return mensaje desencriptado.
     */
    @Override
    public String decrypto(final String key, final String encMess) {
        return crypto(Integer.toString(Integer.parseInt(key) * THEREISNO), encMess);
    }
    /**
     *
     * @param pos posicion.
     * @param key llave.
     * @return reemplazo.
     */
    @Override
    public char getLetter(final int pos, final int key) {
        int multp = key / Math.abs(key);
        return ALPHAS.charAt(pos + key > ALPHAS.length() - 1 || pos + key < FIRSTPOS
                ? pos + key - (multp * ALPHAS.length()) : pos + key);
    }
}
