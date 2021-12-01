package com.christiandevenish;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Window extends JFrame {

    private final Board board;

    private final JPanel mainPanel;
    private final BoardCanvas boardCanvas;

    public Window(Board board) {
        super("Chess");
        this.mainPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        this.mainPanel.setPreferredSize(new Dimension(900, 600));
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        this.boardCanvas = new BoardCanvas(board);
        this.boardCanvas.setPreferredSize(new Dimension(600, 600));
        this.mainPanel.add(boardCanvas);

        // ADD COMPONENT FOR MOVE LIST (PAIN IN ASS) WTF??? SOMETIMES WORKS OTHER TIMES NO??
        Canvas canvas = new Canvas() {
            @Override
            public void paint(Graphics g) {
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, getWidth(), getHeight());
                System.out.println(getWidth() + ", " + getHeight());
                System.out.println("here");
            }
        };
        canvas.setPreferredSize(new Dimension(200, 600));
        this.mainPanel.add(canvas);
        canvas.paint(getGraphics());

        this.board = board;
    }
}
