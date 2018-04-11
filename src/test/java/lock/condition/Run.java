package lock.condition;

public class Run {
    public static void main(String[] args) {
        try {
            MyService myService = new MyService();
            Thread thread = new Thread(new MyThread(myService));
            thread.start();
            Thread.sleep(3000);
            myService.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
