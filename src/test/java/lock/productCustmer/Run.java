package lock.productCustmer;


public class Run {

    public static void main(String[] args) {
        MyService myService = new MyService();
        Thread a = new Thread(new MyThreadA(myService));
        a.start();
        Thread b = new Thread(new MyThreadB(myService));
        b.start();

    }
}
