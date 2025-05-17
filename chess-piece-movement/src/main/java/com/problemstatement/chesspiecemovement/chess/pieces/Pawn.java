package com.problemstatement.chesspiecemovement.chess.pieces;

import com.problemstatement.chesspiecemovement.chess.enums.Color;
import com.problemstatement.chesspiecemovement.chess.enums.Direction;
import com.problemstatement.chesspiecemovement.chess.enums.Steps;

public class Pawn extends AbstractChessPiece {

    public Pawn(String position, Color color) {
        super(new Direction[]{Direction.FORWARD}, Steps.ONE, position, color);
    }

    public Pawn(Color color) {
        super(new Direction[]{Direction.FORWARD}, Steps.ONE,color);
    }
}
