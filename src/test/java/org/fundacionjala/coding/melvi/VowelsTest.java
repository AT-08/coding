package org.fundacionjala.coding.melvi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test for {@link Vowels}.
 */
public class VowelsTest {

    /**
     * Verify correct answer.
     */
        @Test
        public void testCase1() {
            final int expected = 5;
            assertEquals("Nope!", expected, Vowels.getCount("abracadabra"));
        }

    }
