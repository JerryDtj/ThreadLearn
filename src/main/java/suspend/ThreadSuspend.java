package suspend;


/**
 * 线程暂停
 */
public class ThreadSuspend implements Runnable {
    private Long i = 0L;

    public Long getI() {
        return i;
    }

    public void setI(Long i) {
        this.i = i;
    }

    @Override
    public void run() {
        while (true){
            i++;
            if (Thread.currentThread().isInterrupted()){
                System.out.println(Thread.currentThread().getName()+"准备停止");
                break;
            }
        }
    }
}
