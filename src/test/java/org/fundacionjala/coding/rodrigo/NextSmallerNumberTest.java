package org.fundacionjala.coding.rodrigo;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class NextSmallerNumberTest {

    @Test
    public void nextSmaller() {
        NextSmallerNumber nextSmallerNumber = new NextSmallerNumber();
        assertEquals(12, nextSmallerNumber.nextSmaller(21));
//        assertEquals(790, nextSmallerNumber.nextSmaller(907));
//        assertEquals(513, nextSmallerNumber.nextSmaller(531));
        assertEquals(-1, nextSmallerNumber.nextSmaller(1027));
//        assertEquals(414, nextSmallerNumber.nextSmaller(441));
        assertEquals(123456789, nextSmallerNumber.nextSmaller(123456798));
    }
}