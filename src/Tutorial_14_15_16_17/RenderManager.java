package Tutorial_14_15_16_17;

import java.awt.*;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;

public class RenderManager {

    private Canvas screen;

    private ArrayList<Renderable> render = new ArrayList<>();

    public RenderManager(Canvas screen) {
        this.screen = screen;
    }

    public void add(Renderable a){
        render.add(a);
    }

    /**
     * The BufferStrategy class represents the mechanism with which to organize
     * complex memory on a particular Canvas or Window. Hardware and software
     * limitations determine whether and how a particular buffer strategy can
     * be implemented. These limitations are detectible through the capabilities
     * of the GraphicsConfiguration used when creating the Canvas or Window.
     * */
    public void update(){
        BufferStrategy b = screen.getBufferStrategy();

        if (b == null){
            screen.createBufferStrategy(2);
            return;
        }

        // Gets graphics from buffer strategy
        Graphics g = b.getDrawGraphics();
        g.clearRect(0,0,screen.getWidth(),screen.getHeight());

        // Loop through renderables in Arraylist.
        for (Renderable r: render) {
            r.draw(g);
        }

        // Show the graphics & disposing for memorry space.
        b.show();
        g.dispose();
    }
}
