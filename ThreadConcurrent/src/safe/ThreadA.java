package safe;

public class ThreadA implements Runnable {
    private  PrivateSafe privateSafe;

    public ThreadA(PrivateSafe privateSafe){
        this.privateSafe = privateSafe;
    }

    @Override
    public void run() {
        privateSafe.Num("a");
    }
}
