package lock.productCustmer;


public class MyThreadB implements Runnable {
    private MyService myService;

    public MyThreadB(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i=0;i<Integer.MAX_VALUE;i++) {
            myService.get();
        }
    }
}
