package interrupt;

public class InterruptTest {

    public static void main(String[] args) {
        Thread thread = new Thread(new InterruptThread(),"thread1");
        thread.start();
        thread.interrupt();//thread1停止
        System.out.println(thread.getName()+"**"+thread.getId());
        System.out.println(Thread.currentThread().getName()+"***"+Thread.currentThread().getId());
        System.out.println(Thread.interrupted());
        System.out.println(thread.isInterrupted());
        System.out.println("-----------华丽的分割线---------------");
        Thread.currentThread().interrupt();//main方法停止
        System.out.println("end");//end不会输出
    }
}
