package com.christiandevenish;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

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
}
