package org.fundacionjala.coding.rodrigo.cachokata;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CachoTest {

    private Cacho cacho;

    @Before
    public void setUp() {
        cacho = new Cacho();
    }

    @Test
    public void play() {
        final int[] dices = {1, 2, 2, 4, 2};
        final int expected = 6;
        assertEquals(expected, cacho.play(dices));
    }

    @Test
    public void play1() {
        final int[] dices = {1, 2, 3, 4, 5};
        final int expected = 20;
        assertEquals(expected, cacho.play(dices));
    }

    @Test
    public void play2() {
        final int[] dices = {1, 2, 2, 1, 2};
        final int expected = 30;
        assertEquals(expected, cacho.play(dices));
    }

    @Test
    public void play3() {
        final int[] dices = {1, 3, 3, 3, 6};
        final int expected = 9;
        assertEquals(expected, cacho.play(dices));
    }

    @Test
    public void play4() {
        final int[] dices = {3, 3, 3, 3, 3};
        final int expected = 50;
        assertEquals(expected, cacho.play(dices));
    }

    @Test
    public void play5() {
        final int[] dices = {1, 3, 3, 3, 3};
        final int expected = 40;
        assertEquals(expected, cacho.play(dices));
    }
}