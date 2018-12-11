package org.fundacionjala.coding.wilson;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 */
public class CCTest {

    /**
     *
     */
    @Test
    public void testSomething() {
        final int expectedResult = 5;
        assertEquals(expectedResult, CC.charCount("fizzbuzZZ", 'z'));
    }
}
