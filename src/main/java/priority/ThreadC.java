package priority;

public class ThreadC extends ThreadA {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
    }
}
