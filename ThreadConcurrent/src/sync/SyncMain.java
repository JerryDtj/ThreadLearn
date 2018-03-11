package sync;

public class SyncMain {

    public synchronized void methodA(){
        try {
            System.out.println("a");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void methodB(){
        System.out.println("b");
    }
    public void methodC(){
        System.out.println("c");
    }
}
