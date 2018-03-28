package waitAndnotify;

public class MyThread1 implements Runnable {
    private  Object o;

    public MyThread1(Object o){
        this.o = o;
    }

    @Override
    public void run() {
        System.out.println("myThread1开始运行，运行时间："+System.currentTimeMillis());
        synchronized (o){
            try {
                o.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("myThread1恢复运行，恢复时间："+System.currentTimeMillis());
    }
}
