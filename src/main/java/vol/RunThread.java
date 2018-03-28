package vol;

public class RunThread extends Thread {
    private boolean isRunning = true;

    public boolean isRunning() {
        return isRunning;
    }

    public void setRunning(boolean running) {
       this.isRunning = running;
    }

    @Override
    public void run() {
        System.out.println("in");
        while (isRunning==true){
            System.out.println(isRunning);
        }
        System.out.println("out，"+isRunning);
    }
}
