package Tutorial_7;

/**
 * Implementing Runnable
 */
public class Main {
    public static void main(String[] args) {

        Operation op = new Operation();
        Thread opThread = new Thread(op);
        opThread.start();

        while(!op.isFinished()){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(op.hasProgressUpdated()){
                System.out.println(op.getProgress());
            }
        }
        System.out.println("Operation is finished");
    }
}
