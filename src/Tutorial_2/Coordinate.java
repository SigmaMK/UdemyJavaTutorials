package Tutorial_2;

public class Coordinate {
    int x, y, z;

    // Constructor
    public Coordinate(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Overriding inherit Java method
    @Override
    public String toString(){
        return "(" + x + ", " + y + ", " + z + ")";
    }

}
