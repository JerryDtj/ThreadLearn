package lock.method;


public class Run {
    public static void main(String[] args) {
        try {
            HoldCount service = new HoldCount();
            service.serviceMethod1();

            QueueLength queueLength = new QueueLength();
            Thread[] threads = new Thread[10];
            for (int i=0;i<10;i++){
                threads[i] = new Thread(queueLength);
                threads[i].start();
            }
            Thread.sleep(2000);
            System.out.println("有线程数："+queueLength.reentrantLock.getQueueLength());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
