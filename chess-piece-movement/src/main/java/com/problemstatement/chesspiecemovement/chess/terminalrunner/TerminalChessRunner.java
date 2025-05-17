package com.problemstatement.chesspiecemovement.chess.terminalrunner;

import com.problemstatement.chesspiecemovement.chess.enums.Color;
import com.problemstatement.chesspiecemovement.chess.pieces.ChessPiece;
import com.problemstatement.chesspiecemovement.chess.util.ChessUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class TerminalChessRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        if (args.length > 0 && args[0].equalsIgnoreCase("interactive")) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                try {

                    System.out.println("To Continue press Enter or type 'exit' to quit:");
                    String input = scanner.nextLine();
                    if (input.equalsIgnoreCase("exit")) {
                        System.out.println("Exiting...");
                        break;
                    }

                    System.out.println("Enter chess piece (PAWN/KNIGHT/BISHOP/ROOK/QUEEN/KING)");
                    String piece = scanner.nextLine();
                    System.out.println("Enter chess color (WHITE/BLACK)");
                    String color = scanner.nextLine();
                    if (!ChessUtil.isValidColor(color)) {
                        System.out.println("Invalid color:" + color);
                        continue;
                    }

                    System.out.println("Enter chess position in format A1 or a1");
                    String position = scanner.nextLine();
                    if (!ChessUtil.isValidPosition(position)) {
                        System.out.println("Invalid color:" + color);
                        continue;
                    }

                    System.out.println("Chess position: " + position + ", Chess color: " + color + ", Chess piece: " + piece);

                    Color chessColor = Color.valueOf(color.toUpperCase());
                    ChessPiece chessPiece = null;
                    switch (piece.toUpperCase()) {
                        case "PAWN":
                            chessPiece = new com.problemstatement.chesspiecemovement.chess.pieces.Pawn(position, chessColor);
                            break;
                        case "KING":
                            chessPiece = new com.problemstatement.chesspiecemovement.chess.pieces.King(position, chessColor);
                            break;
                        case "QUEEN":
                            chessPiece = new com.problemstatement.chesspiecemovement.chess.pieces.Queen(position, chessColor);
                            break;
                        case "KNIGHT":
                            chessPiece = new com.problemstatement.chesspiecemovement.chess.pieces.Knight(position, chessColor);
                            break;
                        default:
                            System.out.println("Invalid piece type:" + piece);
                            continue;
                    }
                    List<String> moves = chessPiece.evaluatePossibleMovements();
                    System.out.println("Possible moves: " + moves);
                } catch (Exception e) {
                    System.out.println("An error occurred:" + e.getMessage());
                }
            }
            scanner.close();
        }
    }
}
