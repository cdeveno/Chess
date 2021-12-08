package com.christiandevenish.gui;

import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

public final class Spritesheet {

    public static final int TILE_SIZE = 75;

    private static final String WHITE_PAWN_PATH = "res/pieceImages/pawn_white.png";
    private static final String BLACK_PAWN_PATH = "res/pieceImages/pawn_black.png";

    private static final String WHITE_ROOK_PATH = "res/pieceImages/rook_white.png";
    private static final String BLACK_ROOK_PATH = "res/pieceImages/rook_black.png";

    private static final String WHITE_KNIGHT_PATH = "res/pieceImages/knight_white.png";
    private static final String BLACK_KNIGHT_PATH = "res/pieceImages/knight_black.png";

    private static final String WHITE_BISHOP_PATH = "res/pieceImages/bishop_white.png";
    private static final String BLACK_BISHOP_PATH = "res/pieceImages/bishop_black.png";

    private static final String WHITE_KING_PATH = "res/pieceImages/king_white.png";
    private static final String BLACK_KING_PATH = "res/pieceImages/king_black.png";

    private static final String WHITE_QUEEN_PATH = "res/pieceImages/queen_white.png";
    private static final String BLACK_QUEEN_PATH = "res/pieceImages/queen_black.png";

    public static Image getBishopWhiteImage() throws IOException {
        return ImageIO.read(new File(WHITE_BISHOP_PATH)).getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_SMOOTH);
    }

    public static Image getBishopBlackImage() throws IOException {
        return ImageIO.read(new File(BLACK_BISHOP_PATH)).getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_SMOOTH);
    }

    public static Image getKingWhiteImage() throws IOException {
        return ImageIO.read(new File(WHITE_KING_PATH)).getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_SMOOTH);
    }

    public static Image getKingBlackImage() throws IOException {
        return ImageIO.read(new File(BLACK_KING_PATH)).getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_SMOOTH);
    }

    public static Image getKnightWhiteImage() throws IOException {
        return ImageIO.read(new File(WHITE_KNIGHT_PATH)).getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_SMOOTH);
    }

    public static Image getKnightBlackImage() throws IOException {
        return ImageIO.read(new File(BLACK_KNIGHT_PATH)).getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_SMOOTH);
    }

    public static Image getPawnWhiteImage() throws IOException {
        return ImageIO.read(new File(WHITE_PAWN_PATH)).getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_SMOOTH);
    }

    public static Image getPawnBlackImage() throws IOException {
        return ImageIO.read(new File(BLACK_PAWN_PATH)).getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_SMOOTH);
    }

    public static Image getQueenWhiteImage() throws IOException {
        return ImageIO.read(new File(WHITE_QUEEN_PATH)).getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_SMOOTH);
    }

    public static Image getQueenBlackImage() throws IOException {
        return ImageIO.read(new File(BLACK_QUEEN_PATH)).getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_SMOOTH);
    }

    public static Image getRookWhiteImage() throws IOException {
        return ImageIO.read(new File(WHITE_ROOK_PATH)).getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_SMOOTH);
    }

    public static Image getRookBlackImage() throws IOException {
        return ImageIO.read(new File(BLACK_ROOK_PATH)).getScaledInstance(TILE_SIZE, TILE_SIZE, Image.SCALE_SMOOTH);
    }
}
