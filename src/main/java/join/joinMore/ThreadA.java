package join.joinMore;

public class ThreadA extends Thread{
    private ThreadB b;

    public ThreadA(ThreadB b){
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (b){
            try {
                System.out.println("begin a threadName="+Thread.currentThread().getName()+",start time="+System.currentTimeMillis());
                Thread.sleep(4000);
                System.out.println("a end threadName="+Thread.currentThread().getName()+",start time="+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
