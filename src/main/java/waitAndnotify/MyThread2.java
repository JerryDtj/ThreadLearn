package waitAndnotify;

public class MyThread2 implements Runnable {
    private  Object o;

    public MyThread2(Object o){
        this.o = o;
    }

    @Override
    public void run() {
        System.out.println("myThread2开始运行，运行时间："+System.currentTimeMillis());
        synchronized (o){
            o.notify();
        }
        System.out.println("myThread2恢复运行，恢复时间："+System.currentTimeMillis());
    }
}
