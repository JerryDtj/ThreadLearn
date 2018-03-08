package daemon;

public class DaemonTest {

    public static void main(String[] args) {
        try {
            Thread thread = new Thread(new ThreadDaemon());
            thread.setDaemon(true);
            thread.start();
            Thread.sleep(5000);
            System.out.println("stop");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
