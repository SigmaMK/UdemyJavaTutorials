package Tutorial_9;

/** Threads basic logic */
public class Main {
    public static void main(String[] args) {
        Operation op = new Operation();

        op.start();

        Threa.sleep(3000);

        op.stop();


    }
}
