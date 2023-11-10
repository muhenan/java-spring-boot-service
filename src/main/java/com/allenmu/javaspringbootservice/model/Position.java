package com.allenmu.javaspringbootservice.model;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum Position {
    SS("Short Stop"),
    SB("Second Baseman"),
    P("Pitcher"),
    O("Other");

    private final String positionName;

    Position(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionName() {
        return positionName;
    }

    @JsonCreator
    public static Position fromString(String value) {
        for (Position position : Position.values()) {
            if (position.name().equals(value)) {
                return position;
            }
        }
        return Position.O;
    }
}
