package org.fundacionjala.coding.dennis;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 */
public class VigenereTest {
    private Vigenere test;
    public static final String GATOKEY = "GATO";
    public static final String LIMONKEY = "LIMON";

    /**
     *
     */
    @Before
    public void initial() {
        test = new Vigenere();
    }

    /**
     *
     */
    @Test
    public void testVigenNormal() {
        String exp = "TXYP XMUNHCRC";
        String res = test.crypto(LIMONKEY, "HOLA JALASOFT");
        assertEquals(exp, res);
    }

    /**
     *
     */
    @Test
    public void testVigenNormal2() {
        String exp = "TXYP XMUN";
        String res = test.crypto(LIMONKEY, "HOLA JALA");
        assertEquals(exp, res);
    }

    /**
     *
     */
    @Test
    public void testVigenNormal3() {
        String exp = "AF PTV BF PUPWWLDYG";
        String res = test.crypto(GATOKEY, "TE VEO AL ANOCHECER");
        assertEquals(exp, res);
    }

    /**
     *
     */
    @Test
    public void testVigenMenor() {
        String exp = "CPS";
        String res = test.crypto(GATOKEY, "VOY");
        assertEquals(exp, res);
    }

    /**
     *
     */
    @Test
    public void testDecVigen1() {
        String exp = "HOLA JALASOFT";
        String res = test.decrypto(LIMONKEY, "TXYP XMUNHCRC");
        assertEquals(exp, res);
    }

    /**
     *
     */
    @Test
    public void testDecVigen3() {
        String exp = "TE VEO AL ANOCHECER";
        String res = test.decrypto(GATOKEY, "AF PTV BF PUPWWLDYG");
        assertEquals(exp, res);
    }

    /**
     *
     */
    @Test
    public void testDecVigenMenor() {
        String exp = "VOY";
        String res = test.decrypto(GATOKEY, "CPS");
        assertEquals(exp, res);
    }
}
