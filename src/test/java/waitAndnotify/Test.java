package waitAndnotify;

public class Test {
    public static void main(String[] args) {
        Object object = new Object();
        Thread t1 = new Thread(new MyThread1(object));
        Thread t2 = new Thread(new MyThread2(object));
        t1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }

}
