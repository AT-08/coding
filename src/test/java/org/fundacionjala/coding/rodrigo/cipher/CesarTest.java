package org.fundacionjala.coding.rodrigo.cipher;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for the CesarTest.
 */
public class CesarTest {
    private static final String THREE = "3";
    private static final String NTHREE = "-3";
    private static final String ZERO = "0";
    private static final String FIVE = "5";
    private static final String NFIVE = "-5";

    private Cesar cesar;

    /**
     * Initializing the object.
     */
    @Before
    public void setUp() {
        cesar = new Cesar();
    }

    /**
     * Test encode.
     */
    @Test
    public void encodeWord() {
        assertEquals("KROD", cesar.encode("HOLA", THREE));
        assertEquals("ETWWT", cesar.encode("ZORRO", FIVE));
    }

    /**
     * Test decode.
     */
    @Test
    public void decodeWord() {
        assertEquals("ZORRO", cesar.decode("ETWWT", NFIVE));
    }

    /**
     * Null message for test.
     */
    @Test
    public void nullMsg() {
        assertEquals("", cesar.encode("", FIVE));
        assertEquals("", cesar.decode("", NTHREE));
    }

    /**
     * Zero key for test.
     */
    @Test
    public void nullKey() {

        assertEquals("PEPE", cesar.encode("PEPE", ZERO));
        assertEquals("PEPE", cesar.decode("PEPE", ZERO));
        assertEquals("PEPE", cesar.encode("PEPE", NFIVE));
        assertEquals("PEPE", cesar.decode("PEPE", FIVE));
    }

    /**
     * Test for single letter.
     */
    @Test
    public void encodeSingleLetter() {
        assertEquals("C", cesar.encode("Z", THREE));
    }

    /**
     * Test correct Left rotation.
     */
    @Test
    public void rotationL() {
        assertEquals("X", cesar.decode("A", NTHREE));
    }
}
