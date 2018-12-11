package org.fundacionjala.coding.dennis;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public final class CompDNA {

    private static final Map<Character, Character> MAPG;
    static {
        Map<Character, Character> comp = new HashMap<>();
        comp.put('T', 'A'); comp.put('A', 'T');
        comp.put('G', 'C'); comp.put('C', 'G');
        MAPG = Collections.unmodifiableMap(comp);
    }

    /**
     *
     */
    private CompDNA() {
    }

    /**
     *
     * @param st Cadena
     * @return Cadena sb
     */
    public static String cDna(final String st) {
        StringBuilder stringB = new StringBuilder(1);
        for (char elem : st.toCharArray()) {
            stringB.append(MAPG.get(elem));
        }
        return stringB.toString();
    }
}
