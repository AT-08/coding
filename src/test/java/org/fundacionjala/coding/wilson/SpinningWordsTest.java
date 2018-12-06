package org.fundacionjala.coding.wilson;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 */
public class SpinningWordsTest {

    private SpinningWords s;

    /**
     *
     */
    @Before
    public void before() {
        s = new SpinningWords();
    }

    /**
     *
     */
    @Test
    public void testSpin() {
        assertEquals("emocleW to esuoh", s.spinWords("Welcome to house"));
        assertEquals("emocleW", s.spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", s.spinWords("Hey fellow warriors"));
        assertEquals("This is a test", s.spinWords("This is a test"));
        assertEquals("This is rehtona test", s.spinWords("This is another test"));
        assertEquals("ylsuoireS this is the last one", s.spinWords("Seriously this is the last one"));
    }
}
