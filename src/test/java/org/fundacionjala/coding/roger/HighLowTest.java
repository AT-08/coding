package org.fundacionjala.coding.roger;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Unit Tests.
 *
 */
public class HighLowTest {
    private HighLow highAndLow;
    /**
     * SETUP.
     *
     */
    @Before
    public void setUp() {
        highAndLow = new HighLow();
    }
    /**
     * Unit Test 1 TRUE.
     *
     */
    @Test
    public void test1() {
        assertEquals("42 -9", highAndLow.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
