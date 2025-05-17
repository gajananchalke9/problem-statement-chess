package com.problemstatement.chesspiecemovement.chess.pieces;

import com.problemstatement.chesspiecemovement.chess.enums.Color;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class KingTest {

    @Test
    void testKingMoveFromCenter() {
        ChessPiece king = new King("D4", Color.WHITE);
        Set<String> expected = Set.of("C3", "C4", "C5", "D3", "D5", "E3", "E4", "E5");
        assertEquals(expected, Set.copyOf(king.evaluatePossibleMovements()));
    }

    @Test
    void testKingMovesFromTopLeftCorner() {
        ChessPiece king = new King("A8", Color.BLACK);
        Set<String> expected = Set.of("A7", "B8", "B7");
        assertEquals(expected, Set.copyOf(king.evaluatePossibleMovements()));
    }

    @Test
    void testKingMovesFromBottomRightCorner() {
        ChessPiece king = new King("H1", Color.BLACK);
        Set<String> expected = Set.of("G1", "G2", "H2");
        assertEquals(expected, Set.copyOf(king.evaluatePossibleMovements()));
    }

    @Test
    void testKingLowerCaseInputPosition() {
        ChessPiece king = new King("g3", Color.WHITE);
        Set<String> expected = Set.of("F3", "H3", "G2", "G4", "F4", "H4", "F2", "H2");
        assertEquals(expected, Set.copyOf(king.evaluatePossibleMovements()));
    }

    @Test
    void testInvalidPosition(){
        assertThrows(IllegalArgumentException.class, () -> new King("I4", Color.WHITE));
        assertThrows(IllegalArgumentException.class, () -> new King("A9", Color.BLACK));
    }
    
}
