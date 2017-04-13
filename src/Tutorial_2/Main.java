package Tutorial_2;

/** Working with constructors from different classes
 * */
public class Main {
    public static void main(String[] args) {
        Coordinate c = new Coordinate(10, 20, 30);

        //System.out.println(c.x  + " , " + c.y + " , " + c.z);
        System.out.println(c.toString());
    }
}
