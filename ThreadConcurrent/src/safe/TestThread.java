package safe;

public class TestThread {
    public static void main(String[] args) {
        try {
            PrivateSafe safe = new PrivateSafe();

            Thread thread = new Thread(new ThreadA(new PrivateSafe()));
            thread.start();
            Thread thread1 = new Thread(new Threadb(new PrivateSafe()));
            thread1.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
