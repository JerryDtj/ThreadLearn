package syncBlock;

public class SyncBlockAndSync {
    public void syncBlock() {
        synchronized ("aa"){
            System.out.println("in syncBlock");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void block(){
        System.out.println("in sync");
    }
}
