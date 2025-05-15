package com.problemstatement.chesspiecemovement.chess.pieces;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

public class PawnTest {

    @Test
    void testPawnMoveFromCenter(){
        ChessPiece pawn = new Pawn("H3");
        List<String> possibleMoves = pawn.evaluatePossibleMovements();
        assertEquals( 1, possibleMoves.size());
        assertEquals( "H4", possibleMoves.get(0));
    }

    @Test
    void testPawnMoveFromLastRow(){
        ChessPiece pawn = new Pawn("D8");
        List<String> possibleMoves = pawn.evaluatePossibleMovements();
        assertEquals( 0, possibleMoves.size());
    }
    @Test
    void testPawnMoveFromFirstRow(){
        ChessPiece pawn = new Pawn("A2");
        List<String> possibleMoves = pawn.evaluatePossibleMovements();
        assertEquals( 1, possibleMoves.size());
        assertEquals( "A3", possibleMoves.get(0));
    }

    @Test
    void testPawnLowerCaseInputPosition(){
        ChessPiece pawn = new Pawn("g3");
        List<String> possibleMoves = pawn.evaluatePossibleMovements();
        assertEquals( 1, possibleMoves.size());
        assertEquals( "G4", possibleMoves.get(0));
    }
}
