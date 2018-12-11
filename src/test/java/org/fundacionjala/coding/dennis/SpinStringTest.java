package org.fundacionjala.coding.dennis;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author DennisMont
 *
 */
public class SpinStringTest {

    /**
     * Cadenas.
     */
    private String result;
    private String exp;

    /**
     *
     */
    @Test
    public void testRebmun1() {
        result = SpinString.spinningString("Hey fellow warriors");
        exp = "Hey wollef sroirraw";
        assertEquals(exp, result);
    }

    /**
     *
     */
    @Test
    public void testRebmun2() {
        result = SpinString.spinningString("Welcome  classmates");
        exp = "emocleW  setamssalc";
        assertEquals(exp, result);

    }
}
