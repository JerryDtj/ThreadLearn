package waitAndnotify.moreproduct_morecustmer_list;

import waitAndnotify.oneproduct_twocustmer_list.C;
import waitAndnotify.oneproduct_twocustmer_list.MyStack;
import waitAndnotify.oneproduct_twocustmer_list.P;
import waitAndnotify.oneproduct_twocustmer_list.ThreadC;
import waitAndnotify.oneproduct_twocustmer_list.ThreadP;

public class Test {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p1 = new P(myStack);
        P p2 = new P(myStack);
        P p3 = new P(myStack);
        P p4 = new P(myStack);
        P p5 = new P(myStack);
        C r1 = new C(myStack);
        C r2 = new C(myStack);
        C r3 = new C(myStack);
        C r4 = new C(myStack);
        C r5 = new C(myStack);
        ThreadP threadP1 = new ThreadP(p1);
        ThreadP threadP2 = new ThreadP(p2);
        ThreadP threadP3 = new ThreadP(p3);
        ThreadP threadP4 = new ThreadP(p4);
        ThreadP threadP5 = new ThreadP(p5);
        threadP1.start();
        threadP2.start();
        threadP3.start();
        threadP4.start();
        threadP5.start();

        ThreadC c1 = new ThreadC(r1);
        ThreadC c2 = new ThreadC(r2);
        ThreadC c3 = new ThreadC(r3);
        ThreadC c4 = new ThreadC(r4);
        ThreadC c5 = new ThreadC(r5);
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();


    }
}
