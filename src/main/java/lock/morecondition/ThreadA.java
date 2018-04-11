package lock.morecondition;

import java.util.concurrent.locks.Condition;

public class ThreadA implements Runnable{
    private MyService myService;

    public ThreadA(MyService service){
        this.myService = service;
    }

    @Override
    public void run() {
        myService.awaitA();
        System.out.println(1111);//这个输入由于线程等待状态，是不做执行的，什么时候对这个线程唤醒了，什么时候执行
    }
}
