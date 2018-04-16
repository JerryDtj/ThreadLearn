package lock.readWriteLock;

public class ThreadB implements Runnable {

    private Service service;

    public ThreadB(Service service){
        this.service = service;
    }

    @Override
    public void run() {
        service.read();
    }
}
