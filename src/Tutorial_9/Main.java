package Tutorial_9;

/** Threads basic logic */
public class Main {
    public static void main(String[] args) {
        Operation op = new Operation();

        op.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        op.stop();


    }
}
