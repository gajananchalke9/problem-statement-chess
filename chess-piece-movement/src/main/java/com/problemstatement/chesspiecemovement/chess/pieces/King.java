package com.problemstatement.chesspiecemovement.chess.pieces;

import com.problemstatement.chesspiecemovement.chess.enums.Color;
import com.problemstatement.chesspiecemovement.chess.enums.Direction;
import com.problemstatement.chesspiecemovement.chess.enums.Steps;

public class King extends AbstractChessPiece {
    public King(String position, Color color) {
        super(new Direction[]{Direction.LEFT, Direction.RIGHT,
                Direction.FORWARD, Direction.BACKWARD,
                Direction.FORWARD_LEFT, Direction.FORWARD_RIGHT,
                Direction.BACKWARD_LEFT, Direction.BACKWARD_RIGHT}, Steps.ONE, position, color);
    }

    public King(Steps allowedSteps, Color color) {
        super(new Direction[]{Direction.LEFT, Direction.RIGHT,
                Direction.FORWARD, Direction.BACKWARD,
                Direction.FORWARD_LEFT, Direction.FORWARD_RIGHT,
                Direction.BACKWARD_LEFT, Direction.BACKWARD_RIGHT}, Steps.ONE, color);
    }

}
