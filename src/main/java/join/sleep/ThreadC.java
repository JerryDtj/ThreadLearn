package join.sleep;

public class ThreadC implements Runnable{
    private ThreadB b;

    public ThreadC(ThreadB b){
        this.b = b;
    }

    @Override
    public void run() {
        b.bService();
    }
}
