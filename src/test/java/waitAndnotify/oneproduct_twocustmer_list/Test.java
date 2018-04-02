package waitAndnotify.oneproduct_twocustmer_list;

public class Test {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        P p = new P(myStack);
        C r1 = new C(myStack);
        C r2 = new C(myStack);
        C r3 = new C(myStack);
        C r4 = new C(myStack);
        C r5 = new C(myStack);

        ThreadP threadP = new ThreadP(p);
        threadP.start();

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
