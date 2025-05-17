package com.problemstatement.chesspiecemovement.chess.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChessUtilTest {

    @Test
    void testValidPositionTrue() {
        assertTrue(ChessUtil.isValidPosition("A1"));
        assertTrue(ChessUtil.isValidPosition("H8"));
        assertTrue(ChessUtil.isValidPosition("a1"));
        assertTrue(ChessUtil.isValidPosition("h8"));
    }

    @Test
    void testValidPositionFalse() {
        assertFalse(ChessUtil.isValidPosition("I4"));
        assertFalse(ChessUtil.isValidPosition("A9"));
        assertFalse(ChessUtil.isValidPosition(""));
        assertFalse(ChessUtil.isValidPosition(" "));
        assertFalse(ChessUtil.isValidPosition("A"));
        assertFalse(ChessUtil.isValidPosition("1"));
        assertFalse(ChessUtil.isValidPosition(null));
    }

    @Test
    void testGetPositionIndexes() {
        int[] indexes = ChessUtil.getPositionIndexes("A1");
        assertEquals(0, indexes[0]);
        assertEquals(0, indexes[1]);
    }

    @Test
    void testGetPositionIndexesInvalidPosition() {
        assertThrows(IllegalArgumentException.class, () -> ChessUtil.getPositionIndexes("A9"));
        assertThrows(IllegalArgumentException.class, () -> ChessUtil.getPositionIndexes("P4"));
        assertThrows(IllegalArgumentException.class, () -> ChessUtil.getPositionIndexes(""));
        assertThrows(IllegalArgumentException.class, () -> ChessUtil.getPositionIndexes(" "));
        assertThrows(IllegalArgumentException.class, () -> ChessUtil.getPositionIndexes("A"));
        assertThrows(IllegalArgumentException.class, () -> ChessUtil.getPositionIndexes("1"));
        assertThrows(IllegalArgumentException.class, () -> ChessUtil.getPositionIndexes(null));
    }

}
