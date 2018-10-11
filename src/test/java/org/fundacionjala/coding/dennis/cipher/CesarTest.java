package org.fundacionjala.coding.dennis.cipher;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class CesarTest {
    private Cesar test;

    /**
     *
     */
    @Before
    public void initial() {
        test = new Cesar();
    }
    /**
     *
     */
    @Test
    public void testCryptoNormal1() {
        String exp = "KROD";
        String res = test.encode("3", "HOLA");
        assertEquals(exp, res);
    }
    /**
     *
     */
    @Test
    public void testCryptoNormal2() {
        String exp = "ETWWT";
        String res = test.encode("5", "ZORRO");
        assertEquals(exp, res);
    }
    /**
     *
     */
    @Test
    public void testCryptoSpace() {
        String exp = "MTQF ETWWT";
        String res = test.encode("5", "HOLA ZORRO");
        assertEquals(exp, res);
    }
    /**
     *
     */
    @Test
    public void testCryptoNull() {
        String exp = "";
        String res = test.encode("5", "");
        assertEquals(exp, res);
    }
    /**
     *
     */
    @Test
    public void testCryptoKeyNeg() {
        String exp = "BHMD";
        String res = test.encode("-1", "CINE");
        assertEquals(exp, res);
    }
    /**
     *
     */
    @Test
    public void testCryptoKeyNeg2() {
        String exp = "ZYLBY";
        String res = test.encode("-2", "BANDA");
        assertEquals(exp, res);
    }
    /**
     *
     */
    @Test
    public void testDeCryptoNormal1() {
        String exp = "HOLA";
        String res = test.decode("3", "KROD");
        assertEquals(exp, res);
    }
    /**
     *
     */
    @Test
    public void testDeCryptoNormal2() {
        String exp = "ZORRO";
        String res = test.decode("5", "ETWWT");
        assertEquals(exp, res);
    }
    /**
     *
     */
    @Test
    public void testDeCryptoSpace() {
        String exp = "HOLA ZORRO";
        String res = test.decode("5", "MTQF ETWWT");
        assertEquals(exp, res);
    }
}
