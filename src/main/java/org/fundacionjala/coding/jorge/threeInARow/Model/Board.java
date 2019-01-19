package org.fundacionjala.coding.jorge.threeInARow.Model;

import org.fundacionjala.coding.jorge.threeInARow.MarkerType;

import java.util.HashMap;
import java.util.Map;

public class Board {

    private Map<Integer, Box> tableMap  = new HashMap<Integer, Box>(){};

    public Board() {
        tableMap.put(1, new Box());
        tableMap.put(2, new Box());
        tableMap.put(3, new Box());
        tableMap.put(4, new Box());
        tableMap.put(5, new Box());
        tableMap.put(6, new Box());
        tableMap.put(7, new Box());
        tableMap.put(8, new Box());
        tableMap.put(9, new Box());

        tableMap.get(1).fillLForm(null,null, null, tableMap.get(4).getStateBox());
        tableMap.get(1).fill7Form(tableMap.get(5).getStateBox(),tableMap.get(2).getStateBox(), null, null);

        tableMap.get(2).fillLForm(null,tableMap.get(1).getStateBox(), tableMap.get(4).getStateBox(), tableMap.get(5).getStateBox());
        tableMap.get(2).fill7Form(tableMap.get(6).getStateBox(),tableMap.get(3).getStateBox(), null, null);

        tableMap.get(3).fillLForm(null,tableMap.get(2).getStateBox(), tableMap.get(5).getStateBox(), tableMap.get(6).getStateBox());
        tableMap.get(3).fill7Form(null,null, null, null);

        tableMap.get(4).fillLForm(null,null, null, tableMap.get(7).getStateBox());
        tableMap.get(4).fill7Form(tableMap.get(8).getStateBox(),tableMap.get(5).getStateBox(), tableMap.get(3).getStateBox(), tableMap.get(1).getStateBox());

        tableMap.get(5).fillLForm(tableMap.get(1).getStateBox(),tableMap.get(4).getStateBox(), tableMap.get(7).getStateBox(), tableMap.get(8).getStateBox());
        tableMap.get(5).fill7Form(tableMap.get(9).getStateBox(),tableMap.get(6).getStateBox(), tableMap.get(3).getStateBox(), tableMap.get(2).getStateBox());

        tableMap.get(6).fillLForm(tableMap.get(2).getStateBox(),tableMap.get(5).getStateBox(), tableMap.get(8).getStateBox(), tableMap.get(9).getStateBox());
        tableMap.get(6).fill7Form(null,null, null, tableMap.get(3).getStateBox());

        tableMap.get(7).fillLForm(null,null, null, null);
        tableMap.get(7).fill7Form(null,tableMap.get(8).getStateBox(), tableMap.get(5).getStateBox(), tableMap.get(4).getStateBox());

        tableMap.get(8).fillLForm(tableMap.get(4).getStateBox(),tableMap.get(7).getStateBox(), null, null);
        tableMap.get(8).fill7Form(null,tableMap.get(9).getStateBox(), tableMap.get(6).getStateBox(), tableMap.get(5).getStateBox());

        tableMap.get(9).fillLForm(tableMap.get(5).getStateBox(),tableMap.get(8).getStateBox(), null, null);
        tableMap.get(9).fill7Form(null,null, null, tableMap.get(6).getStateBox());
    }

    public Map<Integer, Box> getTableMap() {
        return tableMap;
    }

    public void setTableMap(int key, MarkerType markerType) {
        tableMap.get(key).setStateBox(markerType);
    }
}
