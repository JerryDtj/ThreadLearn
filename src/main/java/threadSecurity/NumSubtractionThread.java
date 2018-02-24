package threadSecurity;


public class NumSubtractionThread implements Runnable {
    private Integer i = 5;

    @Override
    public synchronized void run() {
        Thread t = Thread.currentThread();
        i--;//线程不安全的
        System.out.println(t.getName()+" i="+i);
    }
}
