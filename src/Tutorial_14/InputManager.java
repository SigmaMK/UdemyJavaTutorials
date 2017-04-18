package Tutorial_14;

import java.awt.*;
import java.awt.event.*;

public class InputManager implements KeyListener, MouseListener, MouseMotionListener {

    public static class Keyboard {
        private int numKeys = 500;

        private boolean[] keyTyped = new boolean [numKeys];
        private boolean[] keyPressed = new boolean [numKeys];
        private boolean[] keyReleased = new boolean [numKeys];

        protected void toggleKeyTyped(int keyCode, boolean toggle){
            keyTyped[keyCode] = toggle;
        }
        protected void toggleKeyPressed(int keyCode, boolean toggle){
            keyPressed[keyCode] = toggle;
        }
        protected void toggleKeyReleased(int keyCode, boolean toggle){
            keyReleased[keyCode] = toggle;
        }

        public boolean iskeyTyped(int keyCode){
            return keyTyped[keyCode];
        }
    }
    public static class Mouse {

    }

    private Keyboard keyboard = new Keyboard();
    private Mouse mouse = new Mouse();

    public InputManager(Component c){
        c.addKeyListener(this);
        c.addMouseListener(this);
        c.addMouseMotionListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {}

    @Override
    public void mouseMoved(MouseEvent e) {}

}
