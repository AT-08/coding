package org.fundacionjala.coding.rodrigo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test Vigenere.
 */
public class VigenereTest {
    private Vigenere vigenere;

    /**
     * Setting the Class.
     */
    @Before
    public void setUp() {
        vigenere = new Vigenere();
    }

    /**
     * Test encode of Jala.
     */
    @Test
    public void encode() {
        assertEquals("TXYP XMUNHCRC", vigenere.encode("HOLA JALASOFT", "LIMON"));
    }

    /**
     * Test decode.
     */
    @Test
    public void decode() {
        assertEquals("VFYL", vigenere.decode("HOLA", "LIMON"));
    }

    /**
     * Single encode.
     */
    @Test
    public void singleEncode() {
        assertEquals("IJ", vigenere.encode("HI", "A"));
    }

    /**
     * single decode.
     */
    @Test
    public void singleDecode() {
        assertEquals("GO", vigenere.decode("JR", "C"));
    }


}
