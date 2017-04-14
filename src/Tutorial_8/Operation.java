package Tutorial_8;


public class Operation implements Runnable {

    private Thread opThread;
    private boolean running = false;


    @Override
    public void run() {
        System.out.println("Running has started");

        while(running){
            System.out.println("App logic running ");

            try {
                opThread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            stop();
        }

        System.out.println("Running has stopped");
    }
     public void start(){
        if (!running){
            running = true;
            opThread = new Thread(this);
            opThread.start();
        }
     }

    public void stop () {
        running = false;
    }
}
