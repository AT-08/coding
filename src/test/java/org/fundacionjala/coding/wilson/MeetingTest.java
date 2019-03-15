package org.fundacionjala.coding.wilson;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 *
 */
public class MeetingTest {

    /**
     *
     * @param s names for meeting
     * @param exp names ordered
     */
    private static void testing(final String s, final String exp) {
        String ans = Meeting.meeting(s);
        assertEquals(exp, ans);
    }

    /**
     *
     */
    @Test
    public void test() {
        testing("Alexis:Wahl;Grace:Meta;Ann:Arno;Madison:STAN;Lewis:Kern;Megan:Stan;Alex:Korn",
                "(ARNO, ANN)(KERN, LEWIS)(KORN, ALEX)(META, GRACE)(STAN, MADISON)(STAN, MEGAN)(WAHL, ALEXIS)");
        testing("James:Dorny;Alex:Meta;Elizabeth:Russel;Anna:Korn;Ann:Kern;Amber:Cornwell",
                "(CORNWELL, AMBER)(DORNY, JAMES)(KERN, ANN)(KORN, ANNA)(META, ALEX)(RUSSEL, ELIZABETH)");
        testing("Sarah:Bell;Andrew:Dorries;Ann:Kern;Haley:Arno;Paul:Dorny;Madison:Kern",
                "(ARNO, HALEY)(BELL, SARAH)(DORNY, PAUL)(DORRIES, ANDREW)(KERN, ANN)(KERN, MADISON)");
        testing("Jacob:Wahl;Alex:Wahl;Antony:Gates;Alissa:Meta;Megan:Bell;Amandy:Stan;Anna:Steve",
                "(BELL, MEGAN)(GATES, ANTONY)(META, ALISSA)(STAN, AMANDY)(STEVE, ANNA)(WAHL, ALEX)(WAHL, JACOB)");
        testing("John:Gates;Paul:Wahl;Alex:Tolkien;Ann:Bell;Lewis:Kern;Sarah:Rudd;Sydney:Korn",
                "(BELL, ANN)(GATES, JOHN)(KERN, LEWIS)(KORN, SYDNEY)(RUDD, SARAH)(TOLKIEN, ALEX)(WAHL, PAUL)");
        testing("Paul:Arno;Matthew:Schwarz;Grace:Meta;Ann:Arno;Alex:Schwarz;Jacob:Rudd;Amber:Cornwell",
                "(ARNO, ANN)(ARNO, PAUL)(CORNWELL, AMBER)(META, GRACE)(RUDD, JACOB)(SCHWARZ, ALEX)(SCHWARZ, MATTHEW)");
        testing("Abba:Bell;Jacob:STAN;Ann:STAN;Anna:Bell;Paul:Kern;Alissa:Tolkien",
                "(BELL, ABBA)(BELL, ANNA)(KERN, PAUL)(STAN, ANN)(STAN, JACOB)(TOLKIEN, ALISSA)");
        testing("Ann:Arno;Emily:Stan;Anna:STAN;Jacob:Korn;Sophia:Gates;Amber:Kern",
                "(ARNO, ANN)(GATES, SOPHIA)(KERN, AMBER)(KORN, JACOB)(STAN, ANNA)(STAN, EMILY)");
        testing("Anna:STAN;Antony:Gates;Amber:Korn;Lewis:Dorries;Alex:Kern;Anna:Arno;Elizabeth:Kern;",
                "(ARNO, ANNA)(DORRIES, LEWIS)(GATES, ANTONY)(KERN, ALEX)(KERN, ELIZABETH)(KORN, AMBER)(STAN, ANNA)");
        testing("Alexis:Arno;Alex:Wahl;Grace:STAN;Amber:Kern;Amandy:Schwarz;Paul:Kern",
                "(ARNO, ALEXIS)(KERN, AMBER)(KERN, PAUL)(SCHWARZ, AMANDY)(STAN, GRACE)(WAHL, ALEX)");
    }
}
