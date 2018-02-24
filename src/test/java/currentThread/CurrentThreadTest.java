package currentThread;

public class CurrentThreadTest {

    public static void main(String[] args) {
        Thread thread = new Thread(new CurrentThread(),"thread1");
        thread.start();
//        System.out.println("-----------华丽的分割线---------------");
//        thread.run();

    }
}
