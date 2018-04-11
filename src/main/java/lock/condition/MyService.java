package lock.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    public void await(){
        try {
            lock.lock();
            System.out.println("await time:"+System.currentTimeMillis());
            condition.await();
            System.out.println("b");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }

    }
    public void signal(){
        try {
            lock.lock();
            System.out.println("sinmal timer="+System.currentTimeMillis());
            condition.signal();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
