package org.fundacionjala.coding.dennis;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class HighLowTest {

    /**
     *
     */
    @Test
    public void test1() {
        String probe1 = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        String exp = "42 -9";
        assertEquals(exp, HighLow.hal(probe1));
    }

    /**
     *
     */
    @Test
    public void test2() {
        String probe2 = "-10";
        String exp = "-10 -10";
        assertEquals(exp, HighLow.hal(probe2));
    }

    /**
     *
     */
    @Test
    public void test3() {
        String probe3 = "35";
        String exp = "35 35";
        assertEquals(exp, HighLow.hal(probe3));
    }

    /**
     *
     */
    @Test
    public void test4() {
        String probe4 = "-5 -16 -8 0 -9 -12 -10";
        String exp = "0 -16";
        assertEquals(exp, HighLow.hal(probe4));
    }

    /**
     *
     */
    @Test
    public void test5() {
        String probe4 = "-157 136 -294 171 -153 -283 -47";
        String exp = "171 -294";
        assertEquals(exp, HighLow.hal(probe4));
    }
}
