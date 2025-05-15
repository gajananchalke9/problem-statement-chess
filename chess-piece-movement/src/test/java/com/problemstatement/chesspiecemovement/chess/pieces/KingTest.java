package com.problemstatement.chesspiecemovement.chess.pieces;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class KingTest {

    @Test
    void testKingMoveFromCenter() {
        ChessPiece king = new King("D4");
        Set<String> expected = Set.of("C3", "C4", "C5", "D3", "D5", "E3", "E4", "E5");
        assertEquals(expected, Set.copyOf(king.evaluatePossibleMovements()));
    }

    @Test
    void testKingMovesFromTopLeftCorner() {
        ChessPiece king = new King("A8");
        Set<String> expected = Set.of("A7", "B8", "B7");
        assertEquals(expected, Set.copyOf(king.evaluatePossibleMovements()));
    }

    @Test
    void testKingMovesFromBottomRightCorner() {
        ChessPiece king = new King("H1");
        Set<String> expected = Set.of("G1", "G2", "H2");
        assertEquals(expected, Set.copyOf(king.evaluatePossibleMovements()));
    }

//    @Test
//    void testKingInvalidPosition() {
//        assertThrows(IllegalArgumentException.class, () -> new King("H9"));
//        assertThrows(IllegalArgumentException.class, () -> new King("Z3"));
//    }

    @Test
    void testKingLowerCaseInputPosition() {
        ChessPiece king = new King("g3");
        Set<String> expected = Set.of("F3", "H3", "G2", "G4", "F4", "H4", "F2", "H2");
        assertEquals(expected, Set.copyOf(king.evaluatePossibleMovements()));
    }
}
