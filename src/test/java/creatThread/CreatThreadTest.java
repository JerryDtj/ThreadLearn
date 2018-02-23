package creatThread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CreatThreadTest {
    public static void main(String[] args) {
        //继承多线程实现
        ThreadExtend threadExtend = new ThreadExtend();
        threadExtend.start();
        //实现runable实现
        Thread threadImpl = new Thread(new ThreadImpl());
        threadImpl.start();
        //通过callable和futureTask实现
        Callable callable = new CallableAndFutureTask();
        FutureTask futureTask = new FutureTask(callable);
        Thread callableThread = new Thread(futureTask);
        callableThread.start();
    }
}
