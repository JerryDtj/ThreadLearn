package waitAndnotify.moreproduct_onecustmer_list;

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
        c1.start();



    }
}
