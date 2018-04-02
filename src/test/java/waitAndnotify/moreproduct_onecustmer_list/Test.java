package waitAndnotify.moreproduct_onecustmer_list;

import waitAndnotify.oneproduct_twocustmer_list.C;
import waitAndnotify.oneproduct_twocustmer_list.MyStack;
import waitAndnotify.oneproduct_twocustmer_list.P;
import waitAndnotify.oneproduct_twocustmer_list.ThreadC;
import waitAndnotify.oneproduct_twocustmer_list.ThreadP;

public class Test {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C r = new C(myStack);
        ThreadP p1 = new ThreadP(p);
        ThreadP p2 = new ThreadP(p);
        ThreadP p3 = new ThreadP(p);
        ThreadP p4 = new ThreadP(p);
        ThreadP p5 = new ThreadP(p);
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();

        ThreadC c = new ThreadC(r);
        c.start();


    }
}
