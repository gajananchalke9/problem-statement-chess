package com.problemstatement.chesspiecemovement.chess.pieces;

import com.problemstatement.chesspiecemovement.chess.enums.Direction;
import com.problemstatement.chesspiecemovement.chess.enums.Steps;

public class Queen extends AbstractChessPiece {
    public Queen(String position) {
        super(new Direction[]{Direction.LEFT, Direction.RIGHT,
                Direction.FORWARD, Direction.BACKWARD,
                Direction.FORWARD_LEFT, Direction.FORWARD_RIGHT,
                Direction.BACKWARD_LEFT, Direction.BACKWARD_RIGHT}, Steps.ACROSS_BOARD, position);
    }

    public Queen(Steps allowedSteps) {
        super(new Direction[]{Direction.LEFT, Direction.RIGHT,
                Direction.FORWARD, Direction.BACKWARD,
                Direction.FORWARD_LEFT, Direction.FORWARD_RIGHT,
                Direction.BACKWARD_LEFT, Direction.BACKWARD_RIGHT}, Steps.ACROSS_BOARD);
    }

}
