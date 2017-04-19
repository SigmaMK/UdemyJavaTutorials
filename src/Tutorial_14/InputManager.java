package Tutorial_14;

import javafx.scene.input.KeyCode;

import java.awt.*;
import java.awt.event.*;

public class InputManager implements KeyListener, MouseListener, MouseMotionListener {

    public static class Keyboard {
        private int numKeys = 500;

        private boolean[] keyTyped = new boolean[numKeys];
        private boolean[] keyPressed = new boolean[numKeys];
        private boolean[] keyReleased = new boolean[numKeys];

        protected void toggleKeyTyped(int keyCode, boolean toggle) {
            keyTyped[keyCode] = toggle;
        }

        protected void toggleKeyPressed(int keyCode, boolean toggle) {
            keyPressed[keyCode] = toggle;
        }

        protected void toggleKeyReleased(int keyCode, boolean toggle) {
            keyReleased[keyCode] = toggle;
        }

        public boolean iskeyTyped(int keyCode) {
            return keyTyped[keyCode];
        }

        public boolean isKeyPressed(int keyCode) { return keyPressed[keyCode]; }

        public boolean isKeyReleased(int keyCode) {
            boolean pressCheck = keyReleased[keyCode]; // TRUE
            keyReleased[keyCode] = false; //Set to FALSE because we don't want it marked as released.
            return pressCheck; // Returns value of whether it was released or not.
        }

    }


    public static class Mouse {

        private int numButtons = 10;
        private int x, y;


        private boolean[] buttonClicked = new boolean[numButtons];
        private boolean[] buttonPressed = new boolean[numButtons];
        private boolean[] buttonReleased = new boolean[numButtons];

        private boolean inScreen;

        protected void toggleButtonClicked(int buttonCode, boolean toggle) {
            buttonClicked[buttonCode] = toggle;
        }

        protected void toggleButtonPressed(int buttonCode, boolean toggle) {
            buttonPressed[buttonCode] = toggle;
        }

        protected void toggleButtonReleased(int buttonCode, boolean toggle) {
            buttonReleased[buttonCode] = toggle;
        }

        protected void toggleInScreen(boolean toggle) {
            inScreen = toggle;
        }

        protected void updateCoordinates(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean isMouseClicked(int button) {
            return buttonClicked[button];
        }

        public boolean isMousePressed(int button) {
            return buttonPressed[button];
        }

        public boolean isMouseReleased(int button) {

            boolean clickCheck = buttonClicked[button];
            buttonClicked[button] = false;
            return clickCheck;
        }

        public int getX() { return x; }

        public int getY() { return y; }

        public boolean isInScreen() {
            return inScreen;
        }
    }

    private Keyboard keyboard = new Keyboard();
    private Mouse mouse = new Mouse();

    public InputManager(Component c) {
        c.addKeyListener(this);
        c.addMouseListener(this);
        c.addMouseMotionListener(this);
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        keyboard.toggleKeyTyped(e.getKeyCode(), true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keyboard.toggleKeyTyped(e.getKeyCode(), true);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keyboard.toggleKeyReleased(e.getKeyCode(), true);
        keyboard.toggleKeyPressed(e.getKeyCode(), false);
        keyboard.toggleKeyTyped(e.getKeyCode(), false);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        mouse.toggleButtonClicked(e.getButton(), true);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        mouse.toggleButtonPressed(e.getButton(), true);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        mouse.toggleButtonReleased(e.getButton(), true);
        mouse.toggleButtonClicked(e.getButton(), false);
        mouse.toggleButtonPressed(e.getButton(), false);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        mouse.toggleInScreen(true);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        mouse.toggleInScreen(false);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouse.updateCoordinates(e.getX(),e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouse.updateCoordinates(e.getX(),e.getY());
    }

}
