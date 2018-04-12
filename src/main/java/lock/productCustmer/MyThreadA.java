package lock.productCustmer;


public class MyThreadA implements Runnable {
    private MyService myService;

    public MyThreadA(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i=0;i<Integer.MAX_VALUE;i++) {
            myService.set();
        }
    }
}
