package vol;

public class volTest {
    public static void main(String[] args) {
        try {
            RunThread runThread = new RunThread();
            runThread.start();
            Thread.sleep(3000);
            runThread.setRunning(false);
            System.out.println("runing"+System.currentTimeMillis());
            Thread.sleep(5000);
            System.out.println("main:"+runThread.isRunning()+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
