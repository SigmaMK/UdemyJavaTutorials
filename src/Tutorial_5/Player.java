package Tutorial_5;

/**
 * Interfaces useful for creating structure to program
 *
 */
public interface Player {

    public void move(int x, int y, int z);

    public void changeHealth(int to);

    public int respawn();
}
