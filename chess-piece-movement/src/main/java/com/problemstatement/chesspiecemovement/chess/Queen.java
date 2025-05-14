package com.problemstatement.chesspiecemovement.chess;

import com.problemstatement.chesspiecemovement.enums.Direction;
import com.problemstatement.chesspiecemovement.enums.Steps;

public class Queen extends AbstractChessPiece {
    public Queen(String position) {
        super(new Direction[]{Direction.FORWARD, Direction.FORWARD_LEFT, Direction.FORWARD_RIGHT, Direction.BACKWARD,
                Direction.BACKWARD_LEFT, Direction.BACKWARD_RIGHT}, Steps.ACROSS_BOARD, position);
    }

    public Queen(Steps allowedSteps) {
        super(new Direction[]{Direction.FORWARD, Direction.FORWARD_LEFT, Direction.FORWARD_RIGHT, Direction.BACKWARD,
                Direction.BACKWARD_LEFT, Direction.BACKWARD_RIGHT}, Steps.ACROSS_BOARD);
    }

    @Override
    public String evaluatePossibleMovements() {
        return "";
    }
}
