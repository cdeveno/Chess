package com.christiandevenish;

public class Piece {

    public static final int NONE = 0;

    public static final int King = 1;
    public static final int Pawn = 2;
    public static final int Knight = 3;
    public static final int Bishop = 4;
    public static final int Rook = 5;
    public static final int Queen = 6;

    public static final int White = 8;
    public static final int Black = 16;

    /*
     IN BINARY
     THREE BITS ON RIGHT WILL TELL WHAT PIECE
     TWO BITS ON LEFT WILL TELL WHAT COLOR

     Creating a Piece Example:
     board[0] = Piece.White | Piece.King;
     001
     100
     -> 101 (White King)
    */

}
