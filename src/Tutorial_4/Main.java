package Tutorial_4;

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape() {
            // short hand notation for making a quick abstract method.
            @Override
            public void draw(){
                //draw a shape
            }
        };
    }
}
