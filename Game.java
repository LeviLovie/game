import java.awt.Color;
import java.awt.Graphics;
// import java.awt.Point;
import javax.swing.JPanel;

import game_util.*;

/**
 * A panel maintaining a picture of a Do Not Enter sign.
 */
 public class Game extends JPanel {
    /**
     * Called by the runtime system whenever the panel needs painting.
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        // g.fillOval(0, 0, 100, 100);  
        // g.setColor(Color.RED);
        // g.fillOval(center.x - innerRadius, center.y - innerRadius, innerDiameter, innerDiameter);
        // g.setColor(Color.WHITE);
        g.fillRect(0, 0, 200, 100);
    }

    public void painting(Graphics g, short x, short y, short width, short height) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(x, y, width, height);
    }

    /**
     * A little driver in case you want a stand-alone application.
     */
    public static void main(String[] args) {
        GameUtilitys gametilitys;
    }
}