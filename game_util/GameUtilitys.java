package game_util;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
// import java.awt.Point;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameUtilitys {
    SwingUtilities.invokeLater(() -> {
        var panel = new Game();
        panel.setBackground(Color.WHITE);
        var frame = new JFrame("A simple graphics program");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    });
}
