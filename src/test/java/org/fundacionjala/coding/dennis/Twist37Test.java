package org.fundacionjala.coding.dennis;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 *
 * @author DennisMont
 *
 */
public class Twist37Test {

    /**
     *
     */
    @Test
    public void basicTest1() {
        final Integer[] numbersTest1Exp = new Integer[]{1, 2, 7, 4, 5, 6, 3, 8, 9};
        final Integer[] numbersTest1 = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(numbersTest1Exp, Twist37.sortTwisted37(numbersTest1));
    }

    /**
     *
     */
    @Test
    public void basicTest2() {
        final Integer[] numbersTest2Exp = new Integer[]{12, 14, 13};
        final Integer[] numbersTest2 = new Integer[]{12, 13, 14};
        assertArrayEquals(numbersTest2Exp, Twist37.sortTwisted37(numbersTest2));
    }

    /**
     *
     */
    @Test
    public void basicTest3() {

        final Integer[] numbersTest3Exp = new Integer[]{2, 7, 4, 3, 9};
        final Integer[] numbersTest3 = new Integer[]{9, 2, 4, 7, 3};
        assertArrayEquals(numbersTest3Exp, Twist37.sortTwisted37(numbersTest3));
    }

    /**
     *
     */
    @Test
    public void basicTest4() {

        final Integer[] numbersTest3Exp = new Integer[]{2, 7, 4, 3, 9};
        final Integer[] numbersTest3 = new Integer[]{9, 2, 4, 7, 3};
        assertArrayEquals(numbersTest3Exp, Twist37.sortTwisted37(numbersTest3));
    }
}
