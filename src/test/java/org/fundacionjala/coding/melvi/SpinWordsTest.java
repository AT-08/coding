package org.fundacionjala.coding.melvi;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 */
    public class SpinWordsTest {

        private SpinWords spinWords;

    /**
     *
     */
    @Before
        public void setUp() {
            spinWords = new SpinWords();
        }

        /**
         *
         */
        @Test
        public void testSpinWordsGretaerThanFive() {
            assertEquals("emocleW", spinWords.spinWords("Welcome"));
        }

    /**
     *
     */
    @Test
    public void testSpinWordsGretaerThanFiveSentence() {
        assertEquals("Hey wollef sroirraw", spinWords.spinWords("Hey fellow warriors"));
    }

    }
