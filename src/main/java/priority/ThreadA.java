package priority;

public class ThreadA implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
    }
}
