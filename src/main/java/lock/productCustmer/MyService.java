package lock.productCustmer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private ReentrantLock reentrantLock = new ReentrantLock(true);
    private Condition set = reentrantLock.newCondition();
    private Condition get = reentrantLock.newCondition();

    private boolean hasvalue = false;

    public void set(){
        try {
            reentrantLock.lock();
            if (hasvalue==true){
                System.out.println(11);
                set.await();
            }
//            System.out.println("**");
            hasvalue = true;
            get.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }

    public void get(){
        try {
            reentrantLock.lock();
            if (hasvalue==false){
                System.out.println(22);
                get.await();
            }
//            System.out.println("&&");
            hasvalue = false;
            set.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            reentrantLock.unlock();
        }
    }




}
