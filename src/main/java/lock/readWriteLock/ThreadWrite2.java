package lock.readWriteLock;

public class ThreadWrite2 implements Runnable {

    private Service service;

    public ThreadWrite2(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
