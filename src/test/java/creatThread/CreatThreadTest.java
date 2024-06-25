package creatThread;

import java.util.concurrent.*;

public class CreatThreadTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //继承多线程实现
        ThreadExtend threadExtend = new ThreadExtend();
        threadExtend.start();
        //实现runable实现
        Thread threadImpl = new Thread(new ThreadImpl());
        threadImpl.start();
        //通过callable和futureTask实现
        Callable callable = new CallableAndFutureTask();
        FutureTask<String> futureTask = new FutureTask(callable);
        Thread callableThread = new Thread(futureTask);
        callableThread.start();

        Thread futureThread = new Thread(futureTask);
        futureThread.start();
        String s = (String) futureTask.get();
        System.out.println(s);
        s = null;

        ExecutorService executors = Executors.newSingleThreadExecutor();
        executors.submit(futureThread);
        System.out.println("2:"+futureTask.get());
        s = null;

        Future<?> f = executors.submit(callable);
        System.out.println("3:"+f.get());

        executors.shutdown();

    }
}
