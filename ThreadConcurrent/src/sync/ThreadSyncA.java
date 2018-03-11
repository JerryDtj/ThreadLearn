package sync;

public class ThreadSyncA implements Runnable {
    private SyncMain main;

    public ThreadSyncA(SyncMain main){
        this.main = main;
    }

    @Override
    public void run() {
        main.methodA();
    }
}
