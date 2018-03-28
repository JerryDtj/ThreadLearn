package waitAndnotify.twoproduct_onecustmer_list;

import waitAndnotify.product_custmer_list.MyStack;
import waitAndnotify.product_custmer_list.ThreadC;
import waitAndnotify.product_custmer_list.ThreadP;

public class Test {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Thread p1 = new Thread(new ThreadP(myStack));
        p1.start();
        Thread p2 = new Thread(new ThreadP(myStack));
        p2.start();
        Thread c = new Thread(new ThreadC(myStack));
        c.start();
    }
}
