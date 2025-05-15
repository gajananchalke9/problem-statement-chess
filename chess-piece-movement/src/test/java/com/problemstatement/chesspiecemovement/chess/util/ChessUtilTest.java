package com.problemstatement.chesspiecemovement.chess.util;

import com.problemstatement.chesspiecemovement.chess.pieces.ChessPiece;
import com.problemstatement.chesspiecemovement.chess.pieces.King;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ChessUtilTest {

    @Test
    void testValidPositionTrue() {
        assertEquals(true, ChessUtil.isValidPosition("A1"));
        assertEquals(true, ChessUtil.isValidPosition("H8"));
        assertEquals(true, ChessUtil.isValidPosition("a1"));
        assertEquals(true, ChessUtil.isValidPosition("h8"));
    }

    @Test
    void testValidPositionFalse() {
        assertEquals(false, ChessUtil.isValidPosition("I4"));
        assertEquals(false, ChessUtil.isValidPosition("A9"));
        assertEquals(false, ChessUtil.isValidPosition(""));
        assertEquals(false, ChessUtil.isValidPosition(" "));
        assertEquals(false, ChessUtil.isValidPosition("A"));
        assertEquals(false, ChessUtil.isValidPosition("1"));
        assertEquals(false, ChessUtil.isValidPosition(null));
    }

    @Test
    void testGetPositionIndexes(){
        int[] indexes = ChessUtil.getPositionIndexes("A1");
        assertEquals(0, indexes[0]);
        assertEquals(0, indexes[1]);
    }
}
