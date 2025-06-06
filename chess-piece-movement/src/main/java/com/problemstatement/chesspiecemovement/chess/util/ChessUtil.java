package com.problemstatement.chesspiecemovement.chess.util;

import com.problemstatement.chesspiecemovement.chess.enums.Column;

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

    public static int[] getPositionIndexes(String position) {

        if (!isValidPosition(position)) {
            throw new IllegalArgumentException("Invalid position:" + position);
        }

        int x = Column.valueOf(String.valueOf(position.substring(0, 1).toUpperCase())).ordinal();
        int y = Integer.parseInt(position.substring(1)) - 1; // y index will be -1 of actual position

        return new int[]{x, y};
    }

    public static boolean isValidColor(String color) {
        if (color == null || color.length() <= 0) {
            return false;
        }

        switch (color.toUpperCase()) {
            case "BLACK": return true;
            case "WHITE": return true;
            default: return false;
        }


    }
}
