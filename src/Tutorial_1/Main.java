package Tutorial_1;

/** Creating classes with variables
 * Creating objects of those classes and access variables of classes
 * */
public class Main {
    public static void main(String[] args) {
        class MyClass{
            String name;
            int age;
        }

        MyClass m = new MyClass();
        m.name = "Malcolm";
        m.age  = 23;

        MyClass c = new MyClass();
        c.name = "Therese";
        c.age  = 26;

        System.out.println(m.name + " is " + m.age);
        System.out.println(c.name + " is " + c.age);
    }
}
