package mianshi;

import java.util.concurrent.Semaphore;

/**
 * @Description 三个线程依次执行
 * @Date 2024/6/12 上午4:36
 * @Created by 76574
 */
public class SemaphoreDemo {

    public static void main(String[] args) throws InterruptedException {
        Semaphore s1 = new Semaphore(1);
        Semaphore s2 = new Semaphore(1);
        Semaphore s3 = new Semaphore(1);
        s2.acquire();
        s3.acquire();

        int count = 3;
        for (int i = 0; i < count*3; i++) {
            int num = i%3;
            int finalI = i;
            new Thread(()->{
                try {
                    switch (num){
                        case 0:
                            s1.acquire();
                            System.out.println(finalI+"*"+0);
                            s2.release();
                            break;
                        case 1:
                            s2.acquire();
                            System.out.println(finalI+"*"+1);
                            s3.release();
                            break;
                        case 2:
                            s3.acquire();
                            System.out.println(finalI+"*"+2);
                            s1.release();
                            break;
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }).start();
        }
    }
}
