package lock.morecondition;

public class ThreadB implements Runnable{
    private MyService myService;

    public ThreadB(MyService service){
        this.myService = service;
    }

    @Override
    public void run() {
        myService.awaitB();
    }
}
