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
    }
}
