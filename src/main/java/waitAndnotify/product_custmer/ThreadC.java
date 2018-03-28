package waitAndnotify.product_custmer;

public class ThreadC implements Runnable {
    private  Custmer custmer;
    public ThreadC(Custmer custmer){
        this.custmer = custmer;
    }

    @Override
    public void run() {
        custmer.get();
    }
}
