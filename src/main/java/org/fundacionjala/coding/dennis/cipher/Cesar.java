package org.fundacionjala.coding.dennis.cipher;

/**
 *
 */
public class Cesar implements Cipher {
    public static final int FIRSTPOS = 0;
    public static final int THEREISNO = -1;

    /**
     *
     * @param key llave.
     * @param mess mensage.
     * @return mensaje encriptado.
     */
    @Override
    public String encode(final String key, final String mess) {
        int keyNum = Integer.parseInt(key);
        StringBuilder messCryp = new StringBuilder(1);
        for (char letter : mess.toCharArray()) {
            int pos = Alphabet.ALPHAS.indexOf(letter);
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
    public String decode(final String key, final String encMess) {
        return encode(Integer.toString(Integer.parseInt(key) * THEREISNO), encMess);
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
        return Alphabet.ALPHAS.charAt(pos + key > Alphabet.ALPHAS.length() - 1 || pos + key < FIRSTPOS
                ? pos + key - (multp * Alphabet.ALPHAS.length()) : pos + key);
    }
}
