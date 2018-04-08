package join.sleep;

public class ThreadA implements Runnable{
    private ThreadB b;

    public ThreadA(ThreadB b){
        this.b = b;
    }

    @Override
    public void run() {
        synchronized (b){
            try {
                System.out.println("a in");
                b.start();
//                b.join();
                Thread.sleep(10000);
                System.out.println("a end");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
