package org.fundacionjala.coding.roger;


import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit Tests Spin Words.
 *
 */

public class SpinWordsTest {

    private SpinWords spinWords;

    /**
     * SETUP.
     *
     */

    @Before
    public void setUp() {
        spinWords = new SpinWords();

    }

    /**
     * Unit Test test words.
     *
     */

    @Test
    public void testSpin() {
        assertEquals("emocleW", spinWords.spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }

    /**
     * Unit Test spaces in words.
     *
     */

    @Test
    public void testSpaces() {
        assertEquals("emocleW", spinWords.spinWords(" Welcome"));
        assertEquals("Hey wollef", spinWords.spinWords("Hey fellow "));
        assertEquals("Hey wollef sroirraw", spinWords.spinWords(" Hey fellow warriors "));
    }

    /**
     * Unit Test spinning my word with Uppercase.
     *
     */

    @Test
    public void testWordWithUppercase() {
        assertEquals("EMOCLEW", spinWords.spinWords("WELCOME"));
        assertEquals("HEY WOLLEF SROIRRAW", spinWords.spinWords("HEY FELLOW WARRIORS"));
    }
}
