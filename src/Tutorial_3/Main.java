package Tutorial_3;
 /**
  * Working with Inheritance
  * */
public class Main {
    public static void main(String[] args) {
        Pet aPet = new Cat(true, "Whiskers", "350", 2);
        Pet bPet = new Dog(true, "Scooby", "200", 1);
        Pet cPet = new Fish(true, "Nemo", "500", 3);

        System.out.println("Cat info: \t " + aPet.name + ", " + aPet.price + ", " + aPet.age);
        System.out.println("Dog info: \t " + bPet.name + ", " + bPet.price + ", " + bPet.age);
        System.out.println("Fish info: \t " + cPet.name + ", " + cPet.price + ", " + cPet.age);
    }
}
