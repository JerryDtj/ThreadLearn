package mianshi;

import java.util.concurrent.CountDownLatch;

/**
 * @Description 三个线程并发
 * @Date 2024/6/11 下午5:45
 * @Created by 76574
 */
public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Thread t1 = new Thread(() -> {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(System.currentTimeMillis());
        });

        Thread t2 = new Thread(() -> {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(System.currentTimeMillis());
        });

        Thread t3 = new Thread(() -> {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(System.currentTimeMillis());
        });

        t1.start();
        t2.start();
        t3.start();

        countDownLatch.countDown();
    }

}
