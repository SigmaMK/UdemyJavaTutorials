package Tutorial_3;

public class Cat extends Pet {

    boolean kitten;

    public Cat(boolean kitten, String name, String price, int age) {
        super(name, price, age);
        this.kitten = kitten;
    }
}
