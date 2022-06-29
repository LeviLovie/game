import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
// import java.awt.Point;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;

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

    public static void main(String[] args) {
        /**
         * A little driver in case you want a stand-alone application.
         */
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
}