package com.problemstatement.chesspiecemovement.enums;

public enum Direction {
    FORWARD("Forward"),
    BACKWARD("Backward"),
    LEFT("Left"),
    RIGHT("Right"),
    FORWARD_LEFT("Forward Left"),
    FORWARD_RIGHT("Forward Right"),
    BACKWARD_LEFT("Backward Left"),
    BACKWARD_RIGHT("Backward Right"),;

    private final String value;

    public String getValue() {
        return value;
    }

    Direction(String value) {
        this.value = value;
    }
}
