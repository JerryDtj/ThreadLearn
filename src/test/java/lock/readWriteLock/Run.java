package lock.readWriteLock;


public class Run {
    public static void main(String[] args) {
        Service service = new Service();

        Thread t1 = new Thread(new ThreadA(service));
        t1.start();

        Thread t2 = new Thread(new ThreadB(service));
        t2.start();

    }
}
