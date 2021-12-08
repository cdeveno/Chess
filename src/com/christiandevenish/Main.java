package com.christiandevenish;

import com.christiandevenish.gui.Window;

public class Main {

    private static final String fenString  = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR w KQkq - 0 1";

    public static void main(String[] args) {

        // test code
        Game game = new Game(fenString);
        Window window = new Window(game);

    }
}
