package com.problemstatement.chesspiecemovement.util;

public class ChessUtil {
    public static boolean isValidPosition(String position) {
        if (position == null || position.length() != 2) {
            return false;
        }

        char colChar = Character.toUpperCase(position.charAt(0));
        char rowChar = position.charAt(1);

        boolean validCol = colChar >= 'A' && colChar <= 'H';
        boolean validRow = rowChar >= '1' && rowChar <= '8';

        return validCol && validRow;
    }
}
