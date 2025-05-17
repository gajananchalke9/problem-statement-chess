package com.problemstatement.chesspiecemovement.chess.enums;

public enum Color {
    BLACK("BLACK"), WHITE("WHITE");
    private String value;

    Color(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
