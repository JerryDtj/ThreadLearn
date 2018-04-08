package waitAndnotify.product_custmer_string;

public class Tests {
    public static void main(String[] args) {
        String lock = "sleep";
        Product product = new Product(lock);
        Custmer custmer = new Custmer(lock);

        Thread p = new Thread(new ThreadP(product));
        Thread c = new Thread(new ThreadC(custmer));
        p.start();
        c.start();

    }
}
