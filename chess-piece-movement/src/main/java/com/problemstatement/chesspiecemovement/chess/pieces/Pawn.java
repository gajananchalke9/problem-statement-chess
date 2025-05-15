package com.problemstatement.chesspiecemovement.chess.pieces;

import com.problemstatement.chesspiecemovement.chess.enums.Direction;
import com.problemstatement.chesspiecemovement.chess.enums.Steps;

public class Pawn extends AbstractChessPiece {

    public Pawn(String position) {
        super(new Direction[]{Direction.FORWARD}, Steps.ONE, position);
    }

    public Pawn() {
        super(new Direction[]{Direction.FORWARD}, Steps.ONE);
    }
}
