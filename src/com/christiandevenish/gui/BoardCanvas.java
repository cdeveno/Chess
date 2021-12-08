package com.christiandevenish.gui;

import com.christiandevenish.Board;
import com.christiandevenish.pieces.Piece;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;

public class BoardCanvas extends Canvas {

    private final Board board;

    private final Color lightColor = new Color(227, 193, 111);
    private final Color darkColor = new Color(184, 139, 74);

    public BoardCanvas(Board board) {
        this.board = board;
    }

    @Override
    public void paint(Graphics g) {
        createGraphicalBoard(g);
        try {
            renderPieces(g);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createGraphicalBoard(Graphics g) {
        for (int file = 0; file < 8; file++) {
            for (int rank = 0; rank < 8; rank++) {
                boolean isLightSquare = (file + rank) % 2 == 0;

                Color squareColor = (isLightSquare) ? lightColor : darkColor;
                g.setColor(squareColor);
                g.fillRect(file * (getWidth() / 8), rank * (getHeight() / 8), getWidth() / 8, getHeight() / 8);
            }
        }
    }

    private void renderPieces(Graphics g) throws IOException {
        for (int i = 0; i < board.getBoard().length; i++) {
            int piece = board.getBoard()[i];
            if (piece != 0) {
                switch (piece) {
                    case Piece.White | Piece.Pawn:
                        g.drawImage(Spritesheet.getPawnWhiteImage(), indexToX(i), indexToY(i), null);
                        break;
                    case Piece.Black | Piece.Pawn:
                        g.drawImage(Spritesheet.getPawnBlackImage(), indexToX(i), indexToY(i), null);
                        break;
                    case Piece.White | Piece.Rook:
                        g.drawImage(Spritesheet.getRookWhiteImage(), indexToX(i), indexToY(i), null);
                        break;
                    case Piece.Black | Piece.Rook:
                        g.drawImage(Spritesheet.getRookBlackImage(), indexToX(i), indexToY(i), null);
                        break;
                    case Piece.White | Piece.Knight:
                        g.drawImage(Spritesheet.getKnightWhiteImage(), indexToX(i), indexToY(i), null);
                        break;
                    case Piece.Black | Piece.Knight:
                        g.drawImage(Spritesheet.getKnightBlackImage(), indexToX(i), indexToY(i), null);
                        break;
                    case Piece.White | Piece.Bishop:
                        g.drawImage(Spritesheet.getBishopWhiteImage(), indexToX(i), indexToY(i), null);
                        break;
                    case Piece.Black | Piece.Bishop:
                        g.drawImage(Spritesheet.getBishopBlackImage(), indexToX(i), indexToY(i), null);
                        break;
                    case Piece.White | Piece.King:
                        g.drawImage(Spritesheet.getKingWhiteImage(), indexToX(i), indexToY(i), null);
                        break;
                    case Piece.Black | Piece.King:
                        g.drawImage(Spritesheet.getKingBlackImage(), indexToX(i), indexToY(i), null);
                        break;
                    case Piece.White | Piece.Queen:
                        g.drawImage(Spritesheet.getQueenWhiteImage(), indexToX(i), indexToY(i), null);
                        break;
                    case Piece.Black | Piece.Queen:
                        g.drawImage(Spritesheet.getQueenBlackImage(), indexToX(i), indexToY(i), null);
                        break;
                    default:
                        System.err.println("Unexpected integer value found while rendering pieces.");
                }
            }
        }
    }

    private int indexToX (int index) {
        return (index % 8) * Spritesheet.TILE_SIZE;
    }

    private int indexToY (int index) {
        return (index / 8) * Spritesheet.TILE_SIZE;
    }
}
