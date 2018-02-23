package creatThread;

public class ThreadExtend extends Thread {
    @Override
    public void run() {
        System.out.println("创建线程方式一：继承trread类");
        super.run();
    }
}
