package syncBlock;

public class ThreadE implements Runnable {
    private SyncBlockAndSync syncBlockAndSync;
    public ThreadE(SyncBlockAndSync syncBlockAndSync){
        this.syncBlockAndSync = syncBlockAndSync;
    }

    @Override
    public void run() {
        syncBlockAndSync.block();
    }
}
