package com.problemstatement.chesspiecemovement.chess;

import com.problemstatement.chesspiecemovement.enums.Direction;
import com.problemstatement.chesspiecemovement.enums.Steps;

public class Pawn extends AbstractChessPiece {

    public Pawn(String position) {
        super(new Direction[]{Direction.FORWARD}, Steps.ONE, position);
    }

    public Pawn() {
        super(new Direction[]{Direction.FORWARD}, Steps.ONE);
    }
}
