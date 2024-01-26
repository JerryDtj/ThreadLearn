package threadlocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Jerry
 * @Date 2024/1/26 07:13
 */
public class ThreadlocalLearn {
    public static void main(String[] args) throws InterruptedException {
        ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i=0;i<6;i++){
            int finalI = i;
            if (i<3) {
                pool.execute(() -> {
                    threadLocal.set(finalI);
                    System.out.println(Thread.currentThread().getId()+" set "+threadLocal.get());
                });
            }else {
                pool.execute(() -> {
                    System.out.println(Thread.currentThread().getId()+" get "+threadLocal.get());
                });
            }
        }
        pool.shutdown();
    }
}
