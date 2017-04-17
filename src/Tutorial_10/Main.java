package Tutorial_10;

import java.awt.*;
import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("My Own JFrame"){

            @Override
            public void paint(Graphics g) {
                g.setColor(Color.RED);
                g.fillOval(200, 200, 100, 100);

            }
        };

        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
    }
}
