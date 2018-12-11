package org.fundacionjala.coding.dennis;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author DennisMont
 *
 */
public class SortInnerTest {

    /**
     *
     */
    @Test
    public void test1() {
        String exp = "srot the inner ctonnet in dsnnieedcg oredr";
        assertEquals(exp, SortInner.sortInner("sort the inner content in descending order"));
    }

    /**
     *
     */
    @Test
    public void test2() {
        assertEquals("wiat for me", SortInner.sortInner("wait for me"));
    }

    /**
     *
     */
    @Test
    public void test3() {
        assertEquals("tihs ktaa is esay", SortInner.sortInner("this kata is easy"));
    }

    /**
     *
     */
    @Test
    public void test4() {
        assertEquals("dolbe  espicao", SortInner.sortInner("doble  espacio"));
    }

    /**
     *
     */
    @Test
    public void test5() {
        assertEquals("trplie   espicao", SortInner.sortInner("triple   espacio"));
    }
}
