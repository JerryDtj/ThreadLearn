package creatThread;

import java.util.concurrent.Callable;

public class CallableAndFutureTask implements Callable {


    public String call() throws Exception {
        System.out.println("实现线程的第三种方式：Callable");
        System.out.println(111);
        return "123";
    }
}
