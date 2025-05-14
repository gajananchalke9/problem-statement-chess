package com.problemstatement.chesspiecemovement.enums;

public enum Steps {
    ONE(1),
    ACROSS_BOARD(0);

    private final int value;

    public int getValue() {
        return value;
    }

    Steps(int value) {
        this.value = value;
    }
}
