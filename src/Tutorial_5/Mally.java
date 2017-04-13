package Tutorial_5;

public class Mally implements Player, Melee {

    public int x, y , z;
    public int health = 100;

    @Override
    public void move(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void changeHealth(int to) {
        health += to;
    }

    @Override
    public int respawn() {
        x = 0;
        y = 0;
        z = 0;
        return 0;
    }

    @Override
    public void swingSword() {
        System.out.println("Swinging sword!");

    }
}
