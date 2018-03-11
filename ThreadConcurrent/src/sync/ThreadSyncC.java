package sync;

public class ThreadSyncC implements Runnable {
    private SyncMain main;

    public ThreadSyncC(SyncMain main){
        this.main = main;
    }

    @Override
    public void run() {
        main.methodC();
    }
}
