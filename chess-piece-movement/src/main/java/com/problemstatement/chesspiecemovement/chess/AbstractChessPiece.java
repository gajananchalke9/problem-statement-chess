package com.problemstatement.chesspiecemovement.chess;

import com.problemstatement.chesspiecemovement.enums.Direction;
import com.problemstatement.chesspiecemovement.enums.Steps;

public abstract class AbstractChessPiece implements ChessPiece {
    protected final Direction [] allowedDirections;
    protected final Steps allowedSteps;
    protected String position;

    public AbstractChessPiece(Direction[] allowedDirections, Steps allowedSteps, String position) {
        this.allowedDirections = allowedDirections;
        this.allowedSteps = allowedSteps;
        this.position = position;
    }

    public AbstractChessPiece(Direction[] allowedDirections, Steps allowedSteps) {
        this.allowedDirections = allowedDirections;
        this.allowedSteps = allowedSteps;
    }

    public Direction[] getAllowedDirections() {
        return allowedDirections;
    }

    public Steps getAllowedSteps() {
        return allowedSteps;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
