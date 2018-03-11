package sync;

public class SyncTest {
    public static void main(String[] args) {
        SyncMain mains = new SyncMain();
        Thread threada = new Thread(new ThreadSyncA(mains));
        Thread threadb = new Thread(new ThreadSyncB(mains));
        Thread threadc = new Thread(new ThreadSyncC(mains));
        threada.start();
        threadb.start();
        threadc.start();
    }
}
