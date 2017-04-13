package Tutorial_3;

public class Fish extends Pet {

    boolean goldfish;

    public Fish(boolean goldfish, String name, String price, int age) {
        super(name, price, age);
        this.goldfish = goldfish;
    }
}
