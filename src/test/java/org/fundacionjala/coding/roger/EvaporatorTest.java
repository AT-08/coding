package org.fundacionjala.coding.roger;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Unit Tests.
 *
 */
public class EvaporatorTest {
    private Evaporator deodorantEvaporator;
    /**
     * SETUP.
     *
     */
    @Before
    public void setUp() {
        deodorantEvaporator = new Evaporator();
    }
    /**
     * Unit Test 1 .
     *
     */
    @Test
    public void testEvaporatorOne() {
        final int expected = 22;
        final int ten = 10;
        assertEquals(expected, deodorantEvaporator.evaporator(ten, ten, ten));
    }
}
