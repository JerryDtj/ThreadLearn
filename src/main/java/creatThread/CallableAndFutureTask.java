package creatThread;

import java.util.concurrent.Callable;

public class CallableAndFutureTask implements Callable {


    public Object call() throws Exception {
        System.out.println("实现线程的第三种方式：Callable");
        return null;
    }
}
