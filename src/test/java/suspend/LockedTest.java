package suspend;

public class LockedTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadLocked());
        try {
            thread.start();
            Thread.sleep(1000);
            thread.suspend();
            System.out.println("线程暂停");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
