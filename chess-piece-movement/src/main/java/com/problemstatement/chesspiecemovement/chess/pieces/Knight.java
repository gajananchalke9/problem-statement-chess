package com.problemstatement.chesspiecemovement.chess.pieces;

import com.problemstatement.chesspiecemovement.chess.enums.Color;
import com.problemstatement.chesspiecemovement.chess.enums.Column;
import com.problemstatement.chesspiecemovement.chess.enums.Direction;
import com.problemstatement.chesspiecemovement.chess.enums.Steps;
import com.problemstatement.chesspiecemovement.chess.util.ChessUtil;

import java.util.ArrayList;
import java.util.List;

public class Knight extends AbstractChessPiece {

    public Knight(String position, Color color) {
        super(new Direction[]{}, Steps.ONE, position, color);
    }

    public Knight(Color color) {
        super(new Direction[]{}, Steps.ONE, color);
    }

    @Override
    public List<String> evaluatePossibleMovements() {
        List<String> possibleMoves = new ArrayList<>();
        int[] currentPos = ChessUtil.getPositionIndexes(position);
        int x = currentPos[0];
        int y = currentPos[1];

        int[][] knightMoves = {{2, 1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2}, {2, -1}};

        for (int[] move : knightMoves) {
            int newX = x + move[0];
            int newY = y + move[1];

            if (newX >= 0 && newX < 8 && newY >= 0 && newY < 8) {
                String newPosition = Column.fromIndex(newX).name() + (newY + 1);
                possibleMoves.add(newPosition);
            }
        }

        return possibleMoves;
    }
}
