package com.problemstatement.chesspiecemovement;

import com.problemstatement.chesspiecemovement.chess.ChessPiece;
import com.problemstatement.chesspiecemovement.chess.Pawn;
import com.problemstatement.chesspiecemovement.util.ChessUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ChessPieceMovementApplication {

    public static void main(String[] args) {

        SpringApplication.run(ChessPieceMovementApplication.class, args);
        String position = "G6";
        if (ChessUtil.isValidPosition(position)) {
            ChessPiece chessPiece = new Pawn(position);
            List<String> moves = chessPiece.evaluatePossibleMovements();
            System.out.println(String.join("possible moves:", moves));
        } else {
            System.out.println("Invalid position");
        }
    }
}
