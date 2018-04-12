package lock.productCustmer;


public class RunMore {

    public static void main(String[] args) {
        MyService myService = new MyService();
        Thread a1 = new Thread(new MyThreadA(myService));
        a1.start();
        Thread b1 = new Thread(new MyThreadB(myService));
        b1.start();
        Thread a2 = new Thread(new MyThreadA(myService));
        a2.start();
        Thread b2 = new Thread(new MyThreadB(myService));
        b2.start();
        Thread a3 = new Thread(new MyThreadA(myService));
        a3.start();
        Thread b3 = new Thread(new MyThreadB(myService));
        b3.start();
    }
}
