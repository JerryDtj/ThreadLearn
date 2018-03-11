package sync;

public class ThreadSyncB implements Runnable {
    private SyncMain main;

    public ThreadSyncB(SyncMain main){
        this.main = main;
    }

    @Override
    public void run() {
        main.methodB();
    }
}
