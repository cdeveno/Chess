package com.christiandevenish;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Window extends JFrame {

    private final JPanel mainPanel;
    private final BoardCanvas boardCanvas;

    public Window(Board board) {
        super("Chess");
        this.mainPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        this.mainPanel.setPreferredSize(new Dimension(900, 600));
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        try {
            this.setIconImage(ImageIO.read(new File("res/window_icon/pizza.png")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.boardCanvas = new BoardCanvas(board);
        this.boardCanvas.setPreferredSize(new Dimension(600, 600));
        this.mainPanel.add(boardCanvas);

        // ADD COMPONENT FOR SIDE MENU (WORKING!!!)
        GameHistoryTable gameHistoryTable = new GameHistoryTable(300, 600);
        this.mainPanel.add(gameHistoryTable.getScrollPane());

        this.setVisible(true);

    }
}
