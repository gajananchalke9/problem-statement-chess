package com.problemstatement.chesspiecemovement.chess.enums;

public enum Direction {
    FORWARD("Forward", 0, 1),
    BACKWARD("Backward", 0, -1),
    LEFT("Left", -1, 0),
    RIGHT("Right", 1, 0),
    FORWARD_LEFT("Forward Left", -1, 1),
    FORWARD_RIGHT("Forward Right", 1, 1),
    BACKWARD_LEFT("Backward Left", -1, -1),
    BACKWARD_RIGHT("Backward Right", 1, -1);

    private final String value;
    private final int x;
    private final int y;

    public String getValue() {
        return value;
    }

    Direction(String value, int x, int y) {
        this.value = value;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
