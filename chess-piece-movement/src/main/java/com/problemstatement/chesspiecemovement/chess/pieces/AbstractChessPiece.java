package com.problemstatement.chesspiecemovement.chess.pieces;

import com.problemstatement.chesspiecemovement.chess.constants.ChessConstants;
import com.problemstatement.chesspiecemovement.chess.enums.Column;
import com.problemstatement.chesspiecemovement.chess.enums.Direction;
import com.problemstatement.chesspiecemovement.chess.enums.Steps;
import com.problemstatement.chesspiecemovement.chess.util.ChessUtil;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractChessPiece implements ChessPiece {
    protected final Direction[] allowedDirections;
    protected final Steps allowedSteps;
    protected String position;

    public AbstractChessPiece(Direction[] allowedDirections, Steps allowedSteps, String position) {
        if (!ChessUtil.isValidPosition(position)) {
            throw new IllegalArgumentException("Invalid position:" + position);
        }
        this.allowedDirections = allowedDirections;
        this.allowedSteps = allowedSteps;
        this.position = position;
    }

    public AbstractChessPiece(Direction[] allowedDirections, Steps allowedSteps) {
        this.allowedDirections = allowedDirections;
        this.allowedSteps = allowedSteps;
    }

    public Direction[] getAllowedDirections() {
        return allowedDirections;
    }

    public Steps getAllowedSteps() {
        return allowedSteps;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        if (!ChessUtil.isValidPosition(position)) {
            throw new IllegalArgumentException("Invalid position:" + position);
        }
        this.position = position;
    }

    @Override
    public List<String> evaluatePossibleMovements() {
        List<String> allPossibleMoves = new ArrayList<>();
        int[] positionIndexes = ChessUtil.getPositionIndexes(position);

        for (Direction direction : allowedDirections) {
            int x = positionIndexes[0];
            int y = positionIndexes[1];

            allPossibleMoves.addAll(generateMovesInDirection(direction, x, y));
        }
        return allPossibleMoves;
    }

    private List<String> generateMovesInDirection(Direction direction, int x, int y) {
        List<String> moves = new ArrayList<>();
        int steps = allowedSteps == Steps.ACROSS_BOARD ? ChessConstants.BOARD_SIZE : allowedSteps.getValue();

        for (int i = 0; i < steps; i++) {
            x += direction.getX();
            y += direction.getY();
            if (x < 0 || x > 7 || y < 0 || y > 7) {
                break;
            }
            moves.add(Column.values()[x].name() + (y + 1));
        }
        return moves;
    }
}
