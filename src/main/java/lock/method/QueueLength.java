package lock.method;

import java.util.concurrent.locks.ReentrantLock;

public class QueueLength implements Runnable {

    public ReentrantLock reentrantLock = new ReentrantLock();


    @Override
    public void run() {
        try {
            reentrantLock.lock();
            System.out.println("threadName="+Thread.currentThread().getName()+" in");
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

