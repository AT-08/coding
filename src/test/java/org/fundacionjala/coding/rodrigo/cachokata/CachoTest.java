package org.fundacionjala.coding.rodrigo.cachokata;

import org.junit.Test;

import static org.junit.Assert.*;

public class CachoTest {

    @Test
    public void play() {
        int[] a = {1, 2, 2, 4, 2};
        Cacho cacho = new Cacho();
        System.out.println("HOLA TEST-> " + cacho.play(a));

    }
}