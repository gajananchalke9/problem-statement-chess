package com.problemstatement.chesspiecemovement.chess;

import com.problemstatement.chesspiecemovement.enums.Direction;
import com.problemstatement.chesspiecemovement.enums.Steps;

public class Pawn extends AbstractChessPiece {

    public Pawn() {
        super(new Direction[]{Direction.FORWARD}, Steps.ONE);
    }

    public Pawn(String position) {
        super(new Direction[]{Direction.FORWARD}, Steps.ONE, position);
    }

    @Override
    public String evaluatePossibleMovements() {
        return "";
    }
}
