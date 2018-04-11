package lock.morecondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    private Condition a = lock.newCondition();
    private Condition b = lock.newCondition();

    public void awaitA(){
        this.lock(a);
    }

    public void awaitB(){
        this.lock(b);
    }

    private void lock(Condition condition){
        try {
            lock.lock();
            System.out.println("begin await:"+System.currentTimeMillis()+" threadName="+Thread.currentThread().getName());
            condition.await();
            System.out.println("end await:"+System.currentTimeMillis()+" threadName="+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void signalA(){
        lock.lock();
        a.signal();
        lock.unlock();
    }

    public void signalB(){
        lock.lock();
        b.signal();
        lock.unlock();
    }
}
