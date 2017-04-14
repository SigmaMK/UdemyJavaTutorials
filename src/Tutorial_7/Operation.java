package Tutorial_7;

public class Operation implements Runnable {

    private boolean finished = false;
    private  boolean progressUpdated = true;
    private int progress = 0;

    @Override
    public void run() {
        for(int i = 0; i < 20; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            progress += 5;
            progressUpdated = true;
        }

        finished = true;
    }

    public boolean isFinished() {
        return finished;
    }

    public boolean hasProgressUpdated(){
        return progressUpdated;
    }

    public String getProgress(){
        progressUpdated = false;
        return progress + "%";
    }




}
