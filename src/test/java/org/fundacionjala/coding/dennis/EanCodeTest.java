package org.fundacionjala.coding.dennis;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 *
 */
public class EanCodeTest {

    private static final String POSITIVE = "It has to give True";
    private static final String NEGATIVE = "It has to give False";

    /**
     *
     */
    @Test
    public void testEnCodeTrue() {
        String code = "4003301018398";
        assertTrue(POSITIVE, EanCode.validate(code));
    }

    /**
     *
     */
    @Test
    public void testEnCodeTrue2() {
        String code = "9783815820865";
        assertTrue(POSITIVE, EanCode.validate(code));
    }

    /**
     *
     */
    @Test
    public void testEnCodeTrue3() {
        String code = "9783827317100";
        assertTrue(POSITIVE, EanCode.validate(code));
    }

    /**
     *
     */
    @Test
    public void testEnCodeTrue4() {
        String code = "0000000000017";
        assertTrue(POSITIVE, EanCode.validate(code));
    }

    /**
     *
     */
    @Test
    public void testEnCodeFalse1() {
        String code = "4003301018392";
        assertFalse(POSITIVE, EanCode.validate(code));
    }

    /**
     *
     */
    @Test
    public void testEnCodeFalse2() {
        String code = "9783815820864";
        assertFalse(NEGATIVE, EanCode.validate(code));
    }

    /**
     *
     */
    @Test
    public void testEnCodeFalse3() {
        String code = "9783827317101";
        assertFalse(NEGATIVE, EanCode.validate(code));
    }

    /**
     *
     */
    @Test
    public void testEnCodeFalse4() {
        String code = "0000000000010";
        assertFalse(NEGATIVE, EanCode.validate(code));
    }
}
