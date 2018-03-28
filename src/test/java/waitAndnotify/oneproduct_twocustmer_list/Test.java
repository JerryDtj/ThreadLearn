package waitAndnotify.oneproduct_twocustmer_list;

public class Test {

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        Thread p = new Thread(new ThreadP(myStack));
        p.start();
        Thread c1 = new Thread(new ThreadC1(myStack));
        c1.start();
        Thread c2 = new Thread(new ThreadC2(myStack));
        c2.start();
        Thread c3 = new Thread(new ThreadC3(myStack));
        c3.start();
    }
}
