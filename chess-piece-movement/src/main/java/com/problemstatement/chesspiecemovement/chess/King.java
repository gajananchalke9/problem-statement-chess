package com.problemstatement.chesspiecemovement.chess;

import com.problemstatement.chesspiecemovement.enums.Direction;
import com.problemstatement.chesspiecemovement.enums.Steps;

public class King extends AbstractChessPiece {
    public King(String position) {
        super(new Direction[]{Direction.LEFT, Direction.RIGHT,
                Direction.FORWARD, Direction.BACKWARD,
                Direction.FORWARD_LEFT, Direction.FORWARD_RIGHT,
                Direction.BACKWARD_LEFT, Direction.BACKWARD_RIGHT}, Steps.ONE, position);
    }

    public King(Steps allowedSteps) {
        super(new Direction[]{Direction.LEFT, Direction.RIGHT,
                Direction.FORWARD, Direction.BACKWARD,
                Direction.FORWARD_LEFT, Direction.FORWARD_RIGHT,
                Direction.BACKWARD_LEFT, Direction.BACKWARD_RIGHT}, Steps.ONE);
    }

}
