package com.problemstatement.chesspiecemovement.chess;

import com.problemstatement.chesspiecemovement.enums.Direction;
import com.problemstatement.chesspiecemovement.enums.Steps;

public class King extends AbstractChessPiece {
    public King(String position) {
        super(new Direction[]{Direction.FORWARD, Direction.FORWARD_LEFT, Direction.FORWARD_RIGHT, Direction.BACKWARD,
                Direction.BACKWARD_LEFT, Direction.BACKWARD_RIGHT}, Steps.ONE, position);
    }

    public King(Steps allowedSteps) {
        super(new Direction[]{Direction.FORWARD, Direction.FORWARD_LEFT, Direction.FORWARD_RIGHT, Direction.BACKWARD,
                Direction.BACKWARD_LEFT, Direction.BACKWARD_RIGHT}, Steps.ONE);
    }

    @Override
    public String evaluatePossibleMovements() {
        return "";
    }
}
