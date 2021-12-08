package com.christiandevenish;

import com.christiandevenish.pieces.Piece;

public class Board {

    private final int[] board;

    public Board() {
        board = new int[64];
    }

    public int[] getBoard() {
        return board;
    }
}
