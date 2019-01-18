package org.fundacionjala.coding.abel.ThreeInARow;

/**
 *
 */
public class Box {

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getFile() {
        return file;
    }

    public void setFile(int file) {
        this.file = file;
    }

    String value;
    int row;
    int file;

    public Box(String value, int row, int file) {
        this.value = value;
        this.row = row;
        this.file = file;
    }
}
