package reSync;

public class MyThread implements Runnable {
    @Override
    public void run() {
        Sync sync = new Sync();
        sync.serviceA();
    }
}
