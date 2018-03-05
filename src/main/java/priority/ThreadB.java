package priority;

public class ThreadB implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
    }
}
