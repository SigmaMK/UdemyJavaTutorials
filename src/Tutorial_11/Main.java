package Tutorial_11;

import com.sun.org.apache.xpath.internal.SourceTree;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main {
    public static void main(String[] args) {

        class InputListener implements KeyListener {

            public int x = 100, y = 100;

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    System.out.println("UP Key being pressed");
                    y -= 10;
                }
                else if (e.getKeyCode() == KeyEvent.VK_DOWN){
                    System.out.println("DOWN Key being pressed");
                    y += 10;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyTyped(KeyEvent e) {}
        }

        final InputListener inputListener = new InputListener();

        JFrame frame = new JFrame("User Input"){

            @Override
            public void paint(Graphics g){
                g.setColor(Color.CYAN);
                g.fillOval(inputListener.x, inputListener.y, 100,100);

                repaint();
            }
        };

        // Add listeners
        frame.addKeyListener(new InputListener());

        // Set Options
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

    }
}
