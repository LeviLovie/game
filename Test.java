import java.awt.*;
import javax.swing.*;
 
public class Test extends JFrame {
    public static final int CANVAS_WIDTH  = 640;
    public static final int CANVAS_HEIGHT = 480;

    private DrawCanvas canvas;

    public Test() {
        canvas = new DrawCanvas();
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

        Container cp = getContentPane();
        cp.add(canvas);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setTitle("Game");
        setVisible(true);
    }

    private class DrawCanvas extends JPanel {
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(Color.BLACK);

            g.setColor(Color.WHITE);
            for (int i = 0; i < 500; i++) {
                g.fillOval(100 + i, 100, 250, 250);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    System.out.println("No valid sleep(");
                }
            }
            g.setFont(new Font("Monospaced", Font.PLAIN, 12));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            new Test();
            }
        });
    }
}