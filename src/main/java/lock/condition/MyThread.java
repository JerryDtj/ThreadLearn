package lock.condition;

public class MyThread implements Runnable {
    public MyService myService;

    public MyThread(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.await();
    }
}
