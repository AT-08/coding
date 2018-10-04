package org.fundacionjala.coding.testreversewords;

import org.fundacionjala.coding.reversewords.SpinWords;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Testing.
 */
public class SpinWordsTest {
    private SpinWords words;

    /**
     * Before.
     */
    @Before
    public void setup() {
        words = new SpinWords();
    }

    /**
     * Simple tests.
     */
    @Test
    public void test() {


        assertEquals("emocleW", words.spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", words.spinWords("Hey fellow warriors"));
    }

    /**
     * Random Test.
     */
    @Test
    public void testRamdom() {
        assertEquals("emocleW", words.spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", words.spinWords("Hey fellow warriors"));
        assertEquals("This is a test", words.spinWords("This is a test"));
        assertEquals("This is rehtona test", words.spinWords("This is another test"));
        assertEquals("You are tsomla to the last test", words.spinWords("You are almost to the last test"));
        assertEquals("Just gniddik ereht is llits one more", words.spinWords("Just kidding there is still one more"));
        assertEquals("ylsuoireS this is the last one", words.spinWords("Seriously this is the last one"));
    }
}
