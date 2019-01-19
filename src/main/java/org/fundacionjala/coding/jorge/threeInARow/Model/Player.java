package org.fundacionjala.coding.jorge.threeInARow.Model;

import org.fundacionjala.coding.jorge.threeInARow.MarkerType;

public class Player {
    private String name;

    private MarkerType marker;

    public Player(final String name, final MarkerType marker) {
        this.name = name;
        this.marker = marker;
    }

    public void mark (final MarkerType markerType) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MarkerType getMarker() {
        return marker;
    }

    public void setMarker(MarkerType marker) {
        this.marker = marker;
    }
}
