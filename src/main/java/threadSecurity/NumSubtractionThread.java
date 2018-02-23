package threadSecurity;


public class NumSubtractionThread implements Runnable {
    private Integer i = 5;

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        i--;
        System.out.println(t.getName()+" i="+i);
    }
}
