package Tutorial_12_13;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Set up new Canvas.
        Canvas c =new Canvas();
        c.setSize(800,600);
        c.setVisible(true);

        // Attach Canvas to Render Manager
        final RenderManager rm = new RenderManager(c);

        // Add JFrame
        JFrame frame = new JFrame("My Frame") {
            @Override
            public void paint (Graphics g){
                rm.update();
                repaint();
            }
        };
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        frame.add(c);

        rm.add(g -> {
            g.setColor(Color.CYAN);
            g.fillOval(100,100,200,200);
        });





    }
}
