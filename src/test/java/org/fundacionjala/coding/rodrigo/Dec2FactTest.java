package org.fundacionjala.coding.rodrigo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Dec2FactTest {
    @Test
    public void test11() {
        assertEquals(Dec2Fact.dec2FactString(463L), "341010");
        assertEquals(463L, Dec2Fact.factString2Dec("341010"));
    }

    @Test
    public void test2() {
        assertEquals(463L, Dec2Fact.factString2Dec("A"));
    }
}