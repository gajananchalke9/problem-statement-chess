package com.problemstatement.chesspiecemovement.chess;

import com.problemstatement.chesspiecemovement.enums.Column;
import com.problemstatement.chesspiecemovement.enums.Direction;
import com.problemstatement.chesspiecemovement.enums.Steps;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends AbstractChessPiece {

    public Pawn() {
        super(new Direction[]{Direction.FORWARD}, Steps.ONE);
    }

    public Pawn(String position) {
        super(new Direction[]{Direction.FORWARD}, Steps.ONE, position);
    }

    @Override
    public List<String> evaluatePossibleMovements() {
        List<String> moves = new ArrayList<>();

        int col = Column.valueOf(String.valueOf(position.substring(0, 1).toUpperCase())).ordinal();
        int row = Integer.parseInt(position.substring(1)) - 1; // row index will be -1 of actual position

        int newRow = row + 1;

        if (newRow < 8) {
            String newPosition = Column.values()[col].name() + (newRow + 1); // actual position will be +1 of index value
            moves.add(newPosition);
        }
        return moves;
    }
}
