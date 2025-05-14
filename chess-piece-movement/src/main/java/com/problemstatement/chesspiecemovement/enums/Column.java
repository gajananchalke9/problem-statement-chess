package com.problemstatement.chesspiecemovement.enums;

public enum Column {
    A(0), B(1), C(2), D(3), E(4), F(5), G(6), H(7);
    private final int index;

    Column(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static Column fromChar(String ch) {
        return Column.valueOf(ch);
    }

    public static Column fromIndex(int index) {
        for (Column c : Column.values()) {
            if (c.getIndex() == index) {
                return c;
            }
        }
        throw new IllegalArgumentException("Invalid column index: " + index);
    }
}
