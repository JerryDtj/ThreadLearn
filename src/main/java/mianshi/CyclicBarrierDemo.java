package mianshi;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @Description 多线程等待执行,和countdownLatch不同的是,cyclic Barrier是可以重复执行的,但是countDownLatch是不可以的.
 * @Date 2024/6/11 下午6:30
 * @Created by 76574
 */
public class CyclicBarrierDemo {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("t1结束*******"+i);
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("t2结束*******"+i);
            }
        });

        Thread t3 = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("t3结束*******"+i);
            }
        });
        t1.start();
        t2.start();
        t3.start();

    }


}
