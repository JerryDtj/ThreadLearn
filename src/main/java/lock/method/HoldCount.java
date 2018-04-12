package lock.method;

import java.util.concurrent.locks.ReentrantLock;

public class HoldCount {
    private ReentrantLock lock = new ReentrantLock();
    public void  serviceMethod1(){
        lock.lock();
        //获取调用lock方法的次数
        System.out.println("serviceMethod1 getHoldCount="+lock.getHoldCount());
        this.serviceMethod2();
        lock.unlock();
    }
    public void serviceMethod2(){
        lock.lock();
        System.out.println("serviceMethod1 getHoldCount="+lock.getHoldCount());
        lock.unlock();
    }
}
