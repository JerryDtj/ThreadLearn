package lock.reedtranlock;

public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        Thread t1 = new Thread(new MyThread(myService));
        Thread t2 = new Thread(new MyThread(myService));
        Thread t3 = new Thread(new MyThread(myService));
        Thread t4 = new Thread(new MyThread(myService));
        Thread t5 = new Thread(new MyThread(myService));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}



