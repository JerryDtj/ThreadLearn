package lock.readWriteLock;

public class ThreadWrite implements Runnable {

    private Service service;

    public ThreadWrite(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        service.write();
    }
}
