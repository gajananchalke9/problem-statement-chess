package com.problemstatement.chesspiecemovement.chess.controller;

import com.problemstatement.chesspiecemovement.chess.enums.Color;
import com.problemstatement.chesspiecemovement.chess.pieces.*;
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
    public ResponseEntity<List> moves(@RequestParam String piece, @RequestParam String position, @RequestParam String color) {
        if (!ChessUtil.isValidPosition(position)) {
            return ResponseEntity.badRequest().body(List.of("Invalid position:" + position));
        }
        color = color.toUpperCase();
        if (!ChessUtil.isValidColor(color)) {
            return ResponseEntity.badRequest().body(List.of("Invalid color:" + color));
        }
        Color peiceColor = Color.valueOf(color);

        ChessPiece chessPiece;
        switch (piece.toUpperCase()) {
            case "PAWN":
                chessPiece = new Pawn(position, peiceColor);
                break;
            case "KING":
                chessPiece = new King(position, peiceColor);
                break;
            case "QUEEN":
                chessPiece = new Queen(position, peiceColor);
                break;
            case "KNIGHT":
                chessPiece = new Knight(position, peiceColor);
                break;
            default:
                return ResponseEntity.badRequest().body(List.of("Invalid piece type:" + piece));
        }

        List<String> moves = chessPiece.evaluatePossibleMovements();
        return ResponseEntity.ok(moves);

    }
}
