package com.problemstatement.chesspiecemovement.chess.pieces;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class QueenTest {

    @Test
    void testQueenMoveFromCenter() {
        ChessPiece queen = new Queen("F2");
        Set<String> expected = Set.of("E2", "D2", "C2", "B2", "A2", "G2", "H2", "F3", "F4", "F5", "F6", "F7", "F8", "F1", "E3", "D4", "C5", "B6", "A7", "G3", "H4", "E1", "G1");
        Set<String> actual = Set.copyOf(queen.evaluatePossibleMovements());
        assert (expected.equals(actual));
    }

    @Test
    void testQueenMoveFromBottomLeftCorner(){
        ChessPiece queen = new Queen("A1");
        Set<String> expected = Set.of("B1","C1","D1","E1","F1","G1","H1","A2","A3","A4","A5","A6","A7","A8","B2","C3","D4","E5","F6","G7","H8");
    }

    @Test
    void testQueenMoveFromTopRightCorner(){
        ChessPiece queen = new Queen("H8");
        Set<String> expected = Set.of("G8","F8","E8","D8","C8","B8","A8","H7","H6","H5","H4","H3","H2","H1","G7","F6","E5","D4","C3","B2","A1");
    }

    @Test
    void testQueenLowerCaseInputPosition(){
        ChessPiece queen = new Queen("e1");
        Set<String> expected = Set.of("D1","C1","B1","A1","F1","G1","H1","E2","E3","E4","E5","E6","E7","E8","D2","C3","B4","A5","F2","G3","H4");
        Set<String> actual = Set.copyOf(queen.evaluatePossibleMovements());
        assert (expected.equals(actual));
    }

    @Test
    void testInvalidPosition(){
        assertThrows(IllegalArgumentException.class, () -> new King("I4"));
        assertThrows(IllegalArgumentException.class, () -> new King("A9"));
    }

}
