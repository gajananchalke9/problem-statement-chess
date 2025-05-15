package com.problemstatement.chesspiecemovement.chess.controller;

import com.problemstatement.chesspiecemovement.chess.pieces.ChessPiece;
import com.problemstatement.chesspiecemovement.chess.pieces.King;
import com.problemstatement.chesspiecemovement.chess.pieces.Pawn;
import com.problemstatement.chesspiecemovement.chess.pieces.Queen;
import com.problemstatement.chesspiecemovement.chess.util.ChessUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chess")
public class ChessController {

    @RequestMapping("/moves")
    public ResponseEntity<List> moves(@RequestParam String piece, @RequestParam String position) {
        if (!ChessUtil.isValidPosition(position)) {
            return ResponseEntity.badRequest().body(List.of("Invalid position:" + position));
        }

        ChessPiece chessPiece;
        switch (piece.toUpperCase()) {
            case "PAWN":
                chessPiece = new Pawn(position);
                break;
            case "KING":
                chessPiece = new King(position);
                break;
            case "QUEEN":
                chessPiece = new Queen(position);
                break;
            default:
                return ResponseEntity.badRequest().body(List.of("Invalid piece type:" + piece));
        }

        List<String> moves = chessPiece.evaluatePossibleMovements();
        return ResponseEntity.ok(moves);

    }
}
