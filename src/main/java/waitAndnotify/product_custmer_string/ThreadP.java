package waitAndnotify.product_custmer_string;

public class ThreadP implements Runnable {
    private  Product p;
    public ThreadP(Product p){
        this.p = p;
    }

    @Override
    public void run() {
        p.add();
    }
}
