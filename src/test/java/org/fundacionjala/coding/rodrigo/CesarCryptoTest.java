package org.fundacionjala.coding.rodrigo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for the CesarCryptoTest.
 */
public class CesarCryptoTest {
    private static final String THREE = "3";
    private static final String NTHREE = "-3";
    private static final String ZERO = "0";
    private static final String FIVE = "5";
    private static final String NFIVE = "-5";

    private CesarCrypto cesarCrypto;

    /**
     * Initializing the object.
     */
    @Before
    public void setUp() {
        cesarCrypto = new CesarCrypto();
    }

    /**
     * Test encode.
     */
    @Test
    public void encodeWord() {
        assertEquals("KROD", cesarCrypto.encode("HOLA", THREE));
        assertEquals("ETWWT", cesarCrypto.encode("ZORRO", FIVE));
    }

    /**
     * Test decode.
     */
    @Test
    public void decodeWord() {
        assertEquals("ZORRO", cesarCrypto.decode("ETWWT", NFIVE));
    }

    /**
     * Null message for test.
     */
    @Test
    public void nullMsg() {
        assertEquals("", cesarCrypto.encode("", FIVE));
        assertEquals("", cesarCrypto.decode("", NTHREE));
    }

    /**
     * Zero key for test.
     */
    @Test
    public void nullKey() {

        assertEquals("PEPE", cesarCrypto.encode("PEPE", ZERO));
        assertEquals("PEPE", cesarCrypto.decode("PEPE", ZERO));
        assertEquals("PEPE", cesarCrypto.encode("PEPE", NFIVE));
        assertEquals("PEPE", cesarCrypto.decode("PEPE", FIVE));
    }

    /**
     * Test for single letter.
     */
    @Test
    public void encodeSingleLetter() {
        assertEquals("C", cesarCrypto.encode("Z", THREE));
    }

    /**
     * Test correct Left rotation.
     */
    @Test
    public void rotationL() {
        assertEquals("X", cesarCrypto.decode("A", NTHREE));
    }
}
