package waitAndnotify.product_custmer_list;

public class Test {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Thread p = new Thread(new ThreadP(myStack));
        p.start();
        Thread c = new Thread(new ThreadC(myStack));
        c.start();
    }
}
