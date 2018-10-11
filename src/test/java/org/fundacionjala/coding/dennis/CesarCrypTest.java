package org.fundacionjala.coding.dennis;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 *
 */
public class CesarCrypTest {
    private CesarCryp test;

    /**
     *
     */
    @Before
    public void initial() {
        test = new CesarCryp();
    }
    /**
     *
     */
    @Test
    public void testCryptoNormal1() {
        String exp = "KROD";
        String res = test.crypto("3", "HOLA");
        assertEquals(exp, res);
    }
    /**
     *
     */
    @Test
    public void testCryptoNormal2() {
        String exp = "ETWWT";
        String res = test.crypto("5", "ZORRO");
        assertEquals(exp, res);
    }
    /**
     *
     */
    @Test
    public void testCryptoSpace() {
        String exp = "MTQF ETWWT";
        String res = test.crypto("5", "HOLA ZORRO");
        assertEquals(exp, res);
    }
    /**
     *
     */
    @Test
    public void testCryptoNull() {
        String exp = "";
        String res = test.crypto("5", "");
        assertEquals(exp, res);
    }
    /**
     *
     */
    @Test
    public void testCryptoKeyNeg() {
        String exp = "BHMD";
        String res = test.crypto("-1", "CINE");
        assertEquals(exp, res);
    }
    /**
     *
     */
    @Test
    public void testCryptoKeyNeg2() {
        String exp = "ZYLBY";
        String res = test.crypto("-2", "BANDA");
        assertEquals(exp, res);
    }
    /**
     *
     */
    @Test
    public void testDeCryptoNormal1() {
        String exp = "HOLA";
        String res = test.decrypto("3", "KROD");
        assertEquals(exp, res);
    }
    /**
     *
     */
    @Test
    public void testDeCryptoNormal2() {
        String exp = "ZORRO";
        String res = test.decrypto("5", "ETWWT");
        assertEquals(exp, res);
    }
    /**
     *
     */
    @Test
    public void testDeCryptoSpace() {
        String exp = "HOLA ZORRO";
        String res = test.decrypto("5", "MTQF ETWWT");
        assertEquals(exp, res);
    }
}
