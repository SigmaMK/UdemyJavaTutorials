package Tutorial_9;

import java.awt.*;

public class Operation implements Runnable{

    private Thread opThread;
    private boolean running = false;

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        long timeAtLastUpdate = 0;
        long timeAtLastUpdatePerSecCheck = 0;
        int updatePerSecond = 60;
        int updates = 0;
        double timeBetweenUpdates = 1000 / updatePerSecond;

        while (running){
            long currentTime = System.currentTimeMillis();

            // If enough time has passed, execute logic update.
            if(currentTime - timeAtLastUpdate > timeBetweenUpdates){
                timeAtLastUpdate = currentTime;
                updates++;
            }

            // If one second has passed, check how many UPS occured.
            if (currentTime - timeAtLastUpdatePerSecCheck > 1000){
                System.out.println("UPS " + updates);
                updates = 0;
                timeAtLastUpdatePerSecCheck = currentTime;
            }
        }
        System.out.println("App ran for: " + (System.currentTimeMillis() - startTime / 1000) + "seconds");
    }

    public void start(){
        if (!running){
            running = true;
            opThread = new Thread(this);
            opThread.start();
        }
    }

    public void stop(){
        running = false;

    }
}
