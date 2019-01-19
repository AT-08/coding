package org.fundacionjala.coding.jorge.threeInARow.Model;

import org.fundacionjala.coding.jorge.threeInARow.MarkerType;

public class Box {
    Box horizontalLineLeft;
    Box horizontalLineRigth;
    Box verticalLineUp;
    Box verticalLineDown;
    Box backslashRightDown;
    Box backslashLeftUp;
    Box forwardSlashLeftDown;
    Box forwardSlashRightLeft;
    Box forwardSlashRightUp
            ;
    MarkerType stateBox;
    Boolean available = true;

    public Boolean getAvailable() {
        return available;
    }
    public void setAvailable(final Boolean available) {
        this.available = available;
    }

    /**
     * Class Constructor.
     */
    public Box() {
        this.horizontalLineLeft = null;
        this.horizontalLineRigth = null;

        this.verticalLineUp = null;
        this.verticalLineDown = null;

        this.backslashLeftUp = null;
        this.backslashRightDown = null;

        this.backslashRightDown = null;
        this.forwardSlashLeftDown = null;

        this.forwardSlashRightLeft = null;
        this.forwardSlashRightUp = null;

        this.stateBox = null;

        this.available = null;
    }

    public MarkerType getStateBox() {
        return stateBox;
    }
    public void setStateBox(final MarkerType stateBox) {
        this.stateBox = stateBox;
    }

    public void fillLForm(final MarkerType leftUp, final MarkerType left, final MarkerType leftDown, final MarkerType down) {
        horizontalLineLeft = new Box();
        horizontalLineLeft.setStateBox(left);

        verticalLineDown = new Box();
        verticalLineDown.setStateBox(down);

        backslashLeftUp = new Box();
        backslashLeftUp.setStateBox(leftUp);

        forwardSlashLeftDown = new Box();
        forwardSlashLeftDown.setStateBox(leftDown);
    }

    public void fill7Form(final MarkerType rightDown, final MarkerType right, final MarkerType rightUp, final MarkerType up ) {
        horizontalLineRigth = new Box();
        horizontalLineRigth.setStateBox(right);

        verticalLineUp = new Box();
        verticalLineUp.setStateBox(up);

        backslashRightDown = new Box();
        backslashRightDown.setStateBox(rightDown);

        forwardSlashRightUp = new Box();
        forwardSlashRightUp.setStateBox(rightUp);
    }

    public MarkerType getBackslash() {
        return stateBox.equals(backslashLeftUp)?null:stateBox.equals(backslashLeftUp)?null:stateBox;
    }

    public MarkerType getForwardSlash() {
        return stateBox.equals(forwardSlashLeftDown)?null:stateBox.equals(forwardSlashRightLeft)?null:stateBox;
    }

    public MarkerType getVerticalLine() {
        return stateBox.equals(verticalLineDown)?null:stateBox.equals(verticalLineUp)?null:stateBox;
    }

    public MarkerType getHorizontalLine() {
        return stateBox.equals(horizontalLineLeft)?null:stateBox.equals(horizontalLineRigth)?null:stateBox;
    }
}
