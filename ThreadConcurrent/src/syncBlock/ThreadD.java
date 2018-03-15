package syncBlock;

public class ThreadD implements Runnable {
    private SyncBlockAndSync syncBlockAndSync;
    public ThreadD(SyncBlockAndSync syncBlockAndSync){
        this.syncBlockAndSync = syncBlockAndSync;
    }

    @Override
    public void run() {
        syncBlockAndSync.syncBlock();
    }
}
