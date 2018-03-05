package suspend;

public class ThreadLocked implements Runnable {
    @Override
    public void run() {
        long i = 0L;
        while (true){
            i++;
            System.out.println(i);
        }
    }
}
