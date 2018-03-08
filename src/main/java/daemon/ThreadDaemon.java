package daemon;

public class ThreadDaemon implements Runnable {
    private int i = 0;
    @Override
    public void run() {
        try {
            while (true){
                i++;
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
