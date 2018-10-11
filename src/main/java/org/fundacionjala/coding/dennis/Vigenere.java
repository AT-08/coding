package org.fundacionjala.coding.dennis;
import java.util.ArrayList;

import static org.fundacionjala.coding.dennis.Alphabet.ALPHAS;

/**
 *
 */
public class Vigenere implements Encrypto {
    public static final int THEREISNO = -1;
    public static final int FIRSTPOS = 0;

    /**
     *
     * @param key llave.
     * @param mess mensage.
     * @return
     */
    @Override
    public String crypto(final String key, final String mess) {
        return engine(key, mess, 1);
    }

    /**
     *
     * @param key llave.
     * @param encMess mensaje encriptado.
     * @return
     */
    @Override
    public String decrypto(final String key, final String encMess) {
        return engine(key, encMess, -1);
    }

    /**
     *
     * @param key cadena.
     * @param encMess mensaje.
     * @param sign codificar o decodificar.
     * @return resultado.
     */
    private String engine(final String key, final String encMess, int sign) {
        ArrayList<Integer> keyArray = new ArrayList<>();
        for (char letter : key.toCharArray()) {
            keyArray.add((ALPHAS.indexOf(letter) + 1) * sign);
        }
        StringBuilder messCryp = new StringBuilder(1);
        int posKeyArray = 0;
        for (char letter : encMess.toCharArray()) {
            posKeyArray = posKeyArray < keyArray.size() ? posKeyArray : 0;
            int pos = ALPHAS.indexOf(letter);
            letter = pos == THEREISNO ? letter : getLetter(pos, keyArray.get(posKeyArray++));
            messCryp.append(letter);
        }
        return messCryp.toString();
    }

    /**
     *
     * @param pos posicion actual.
     * @param key llave de codificacion.
     * @return caracter nuevo.
     */
    @Override
    public char getLetter(final int pos, final int key) {
        int multp = key / Math.abs(key);
        return ALPHAS.charAt(pos + key > ALPHAS.length() - 1 || pos + key < FIRSTPOS
                ? pos + key - (multp * ALPHAS.length()) : pos + key);
    }
}
