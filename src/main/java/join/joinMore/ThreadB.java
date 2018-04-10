package join.joinMore;

public class ThreadB extends Thread{
    @Override
    public synchronized void run() {
        try {
            System.out.println("b run threadName="+Thread.currentThread().getName()+", begin time="+System.currentTimeMillis());
            Thread.sleep(3000);
            System.out.println("b end threadName="+Thread.currentThread().getName()+" end time="+System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
