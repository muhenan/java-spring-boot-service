package com.allenmu.javaspringbootservice.util;

public enum Position {
    SS("Short Stop"),
    SB("Second Baseman"),
    P("Pitcher");

    private final String positionName;

    Position(String positionName) {
        this.positionName = positionName;
    }

    public String getPositionName() {
        return positionName;
    }
    }
