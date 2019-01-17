package org.fundacionjala.coding.jorge.threeInARow;

public class FieldToBoard {

    MarkerType stateField;

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    Boolean available = true;

    public FieldToBoard() {
        stateField = null;
    }

    public MarkerType getStateField() {
        return stateField;
    }

    public void setStateField(MarkerType stateField) {
        this.stateField = stateField;
    }
}
