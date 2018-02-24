package currentThread;

public class CurrentThread implements Runnable {
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getContextClassLoader());
        System.out.println(thread.getId());
        System.out.println(thread.getPriority());
        System.out.println(thread.getStackTrace());
        System.out.println(thread.getState());
        System.out.println(thread.getThreadGroup());
        System.out.println(thread.getUncaughtExceptionHandler());
    }
}
