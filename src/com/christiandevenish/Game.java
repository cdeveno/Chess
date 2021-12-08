package com.christiandevenish;

import com.christiandevenish.pieces.Piece;

import java.util.HashMap;
import java.util.Map;

public class Game {

    private final Board board;

    public Game(String fen) {
        board = new Board();
        loadPositionFromFen(fen);

    }

    private void loadPositionFromFen(String fen) { //TODO Implement full FEN functionality
        Map<Character, Integer> pieceTypeFromSymbol = new HashMap<>();
        {
            pieceTypeFromSymbol.put('k', Piece.King);
            pieceTypeFromSymbol.put('p', Piece.Pawn);
            pieceTypeFromSymbol.put('n', Piece.Knight);
            pieceTypeFromSymbol.put('b', Piece.Bishop);
            pieceTypeFromSymbol.put('r', Piece.Rook);
            pieceTypeFromSymbol.put('q', Piece.Queen);
        }

        String fenBoard = fen.split(" ")[0];
        int file = 0, rank = 7;

        for (char symbol : fenBoard.toCharArray()) {
            if (symbol == '/') {
                file = 0;
                rank--;
            } else {
                if (Character.isDigit(symbol)) {
                    file += Character.getNumericValue(symbol);
                } else {
                    int pieceColor = Character.isUpperCase(symbol) ? Piece.White : Piece.Black;
                    int pieceType = pieceTypeFromSymbol.get(Character.toLowerCase(symbol));
                    board.getBoard()[rank * 8 + file] = pieceType | pieceColor;
                    file++;
                }
            }
        }
    }

    public Board getBoard() {
        return board;
    }
}
