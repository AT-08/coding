package org.fundacionjala.coding.jorge.threeInARow.Model;

import org.fundacionjala.coding.jorge.threeInARow.MarkerType;
import java.util.Map;

public class Reviser {

    public boolean reviserGame(final Map<Integer, Box> board) {
        MarkerType result = null;
        for (Map.Entry<Integer, Box> entry : board.entrySet())
        {
            if(entry.getValue().getBackslash().equals(null)) {
                result = entry.getValue().getBackslash();
            }
            if(entry.getValue().getForwardSlash().equals(null)) {
                result = entry.getValue().getForwardSlash();
            }
            if(entry.getValue().getHorizontalLine().equals(null)) {
                result = entry.getValue().getHorizontalLine();
            }
            if(entry.getValue().getVerticalLine().equals(null)) {
                result = entry.getValue().getVerticalLine();
            }
        }
        return !result.equals(null)?false:true;
    }
}
