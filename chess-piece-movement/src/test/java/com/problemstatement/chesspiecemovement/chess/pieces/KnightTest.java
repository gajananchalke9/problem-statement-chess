package com.problemstatement.chesspiecemovement.chess.pieces;

import com.problemstatement.chesspiecemovement.chess.enums.Color;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class KnightTest {

    @Test
    void testKnightMoveFromCenter() {
        ChessPiece Knight = new Knight("D4", Color.WHITE);
        Set<String> expected = Set.of("F5", "E6", "C6", "B5", "B3", "C2", "E2", "F3");
        assertEquals(expected, Set.copyOf(Knight.evaluatePossibleMovements()));
    }

    @Test
    void testKnightMovesFromTopLeftCorner() {
        ChessPiece Knight = new Knight("A8", Color.BLACK);
        Set<String> expected = Set.of("B6", "C7");
        assertEquals(expected, Set.copyOf(Knight.evaluatePossibleMovements()));
    }

    @Test
    void testKnightMovesFromBottomRightCorner() {
        ChessPiece Knight = new Knight("H1", Color.BLACK);
        Set<String> expected = Set.of("G3", "F2");
        assertEquals(expected, Set.copyOf(Knight.evaluatePossibleMovements()));
    }

    @Test
    void testKnightLowerCaseInputPosition() {
        ChessPiece Knight = new Knight("g3", Color.WHITE);
        Set<String> expected = Set.of("H5", "F5", "E4", "E2", "F1", "H1");
        assertEquals(expected, Set.copyOf(Knight.evaluatePossibleMovements()));
    }

    @Test
    void testInvalidPosition() {
        assertThrows(IllegalArgumentException.class, () -> new Knight("I4", Color.WHITE));
        assertThrows(IllegalArgumentException.class, () -> new Knight("A9", Color.BLACK));
    }
}
