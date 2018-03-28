package waitAndnotify.product_custmer;

public class Tests {
    public static void main(String[] args) {
        String lock = "lock";
        Product product = new Product(lock);
        Custmer custmer = new Custmer(lock);

        Thread p = new Thread(new ThreadP(product));
        Thread c = new Thread(new ThreadC(custmer));
        p.start();
        c.start();

    }
}
