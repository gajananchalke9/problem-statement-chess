package com.problemstatement.chesspiecemovement.chess.pieces;

import static org.junit.jupiter.api.Assertions.*;

import com.problemstatement.chesspiecemovement.chess.enums.Color;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PawnTest {

    @Test
    void testWhitePawnMoveFromCenter(){
        ChessPiece pawn = new Pawn("H3", Color.WHITE);
        List<String> possibleMoves = pawn.evaluatePossibleMovements();
        assertEquals( 1, possibleMoves.size());
        assertEquals( "H4", possibleMoves.get(0));
    }

    @Test
    void testWhitePawnMoveFromLastRow(){
        ChessPiece pawn = new Pawn("D8", Color.WHITE);
        List<String> possibleMoves = pawn.evaluatePossibleMovements();
        assertEquals( 0, possibleMoves.size());
    }
    @Test
    void testWhitePawnMoveFromFirstRow(){
        ChessPiece pawn = new Pawn("A2",Color.WHITE);
        List<String> possibleMoves = pawn.evaluatePossibleMovements();
        assertEquals( 1, possibleMoves.size());
        assertEquals( "A3", possibleMoves.get(0));
    }

    @Test
    void testWhitePawnLowerCaseInputPosition(){
        ChessPiece pawn = new Pawn("g3", Color.WHITE);
        List<String> possibleMoves = pawn.evaluatePossibleMovements();
        assertEquals( 1, possibleMoves.size());
        assertEquals( "G4", possibleMoves.get(0));
    }

    @Test
    void testBlackPawnMoveFromCenter(){
        ChessPiece pawn = new Pawn("H3", Color.BLACK);
        List<String> possibleMoves = pawn.evaluatePossibleMovements();
        assertEquals( 1, possibleMoves.size());
        assertEquals( "H2", possibleMoves.get(0));
    }

    @Test
    void testBlackPawnMoveFromLastRow(){
        ChessPiece pawn = new Pawn("D8", Color.BLACK);
        List<String> possibleMoves = pawn.evaluatePossibleMovements();
        assertEquals( "D7", possibleMoves.get(0));

    }
    @Test
    void testBlackPawnMoveFromFirstRow(){
        ChessPiece pawn = new Pawn("A2",Color.BLACK);
        List<String> possibleMoves = pawn.evaluatePossibleMovements();
        assertEquals( 1, possibleMoves.size());
        assertEquals( "A1", possibleMoves.get(0));
    }

    @Test
    void testBlackPawnLowerCaseInputPosition(){
        ChessPiece pawn = new Pawn("g3", Color.BLACK);
        List<String> possibleMoves = pawn.evaluatePossibleMovements();
        assertEquals( 1, possibleMoves.size());
        assertEquals( "G2", possibleMoves.get(0));
    }

    @Test
    void testInvalidPosition(){
        assertThrows(IllegalArgumentException.class, () -> new Pawn("I4", Color.WHITE));
        assertThrows(IllegalArgumentException.class, () -> new Pawn("A9", Color.BLACK));
    }
}
