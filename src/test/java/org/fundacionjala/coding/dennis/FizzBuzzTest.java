package org.fundacionjala.coding.dennis;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 *
 */
public class FizzBuzzTest {

    private List<String> res;
    private String exp;

    /**
     *
     */
    @Before
    public void ini() {
        res = new ArrayList<>();
        final int tam = 100;
        res = FizzBuzz.listFizzBuzz(tam);
    }

    /**
     *
     */
    @Test
    public void testFizzBuzzDiv3() {
        final int three = 2;
        exp = "Fizz";
        assertEquals(exp, res.get(three));
    }

    /**
     *
     */
    @Test
    public void testFizzBuzzDiv5() {
        final int ninetyfive = 94;
        exp = "Buzz";
        assertEquals(exp, res.get(ninetyfive));
    }

    /**
     *
     */
    @Test
    public void testFizzBuzzDiv35() {
        final int thirty = 29;
        exp = "FizzBuzz";
        assertEquals(exp, res.get(thirty));
    }

    /**
     *
     */
    @Test
    public void testFizzBuzzNoneDiv() {
        final int eightyeight = 87;
        exp = "88";
        assertEquals(exp, res.get(eightyeight));
    }

    /**
     *
     */
    @Test
    public void testFizzBuzzElem3() {
        final int thirtyseven = 36;
        exp = "Fizz";
        assertEquals(exp, res.get(thirtyseven));
    }

    /**
     *
     */
    @Test
    public void testFizzBuzzElem5() {
        final int fiftytwo = 51;
        exp = "Buzz";
        assertEquals(exp, res.get(fiftytwo));
    }

    /**
     * Main.
     */
    @Test
    public void testArray() {
        final int tam = 5;
        List<String> arr = FizzBuzz.listFizzBuzz(tam);
        List<String> expexted = new ArrayList<>();
        expexted.add("1");
        expexted.add("2");
        expexted.add("Fizz");
        expexted.add("4");
        expexted.add("Buzz");
        assertArrayEquals(expexted.toArray(), arr.toArray());
    }
}
