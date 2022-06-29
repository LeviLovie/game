import java.awt.*;
import javax.swing.*;

class Screen {
    void start() {
        // creating object of JFrame(Window popup)
        JFrame window = new JFrame();
  
        // setting closing operation
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        // setting size of the pop window
        window.setBounds(30, 30, 200, 200);
  
        // setting canvas for draw
        window.getContentPane().add(paint(g));
  
        // set visibility
        window.setVisible(true);
    }

    void paint(Graphics g)
    {
  
        // draw and display the line
        g.drawLine(30, 20, 80, 90);
    }
}


public class Game {
    public static void main(String[] args) {
        Screen screen = new Screen();
        screen.start();
    }
}