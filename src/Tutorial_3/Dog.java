package Tutorial_3;

public class Dog extends Pet {

    boolean puppy;

    public Dog(boolean puppy, String name, String price, int age) {
        super(name, price, age);
        this.puppy = puppy;
    }
}
