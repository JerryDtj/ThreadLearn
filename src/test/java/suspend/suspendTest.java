package suspend;

public class suspendTest {
    public static void main(String[] args) {
        ThreadSuspend threadSuspend = new ThreadSuspend();
        Thread thread = new Thread(threadSuspend);
        thread.start();
        try {
            //线程暂停
            thread.suspend();
            System.out.println("线程暂停成功，准备休眠5s，此时时间为："+ System.currentTimeMillis()+"，此时i的值为："+threadSuspend.getI());
            Thread.sleep(5000);
            System.out.println("线程休眠完成，开始恢复，此时时间为："+ System.currentTimeMillis()+"，此时i的值为："+threadSuspend.getI());
//            线程启动
            thread.resume();
            System.out.println("线程恢复成功，准备休眠，此时时间为："+ System.currentTimeMillis()+"，此时i的值为："+threadSuspend.getI());
            Thread.sleep(5000);
            System.out.println("线程休眠完成，准备再次暂停，此时时间为："+ System.currentTimeMillis()+"，此时i的值为："+threadSuspend.getI());
            //再次暂停
            thread.suspend();
            System.out.println("线程暂停成功，准备休眠5s，此时时间为："+ System.currentTimeMillis()+"，此时i的值为："+threadSuspend.getI());
            Thread.sleep(5000);
            System.out.println("线程休眠完成，开始恢复，此时时间为："+ System.currentTimeMillis()+"此时i的值为："+threadSuspend.getI());
            thread.resume();
            System.out.println("线程恢复成功，准备停止，此时时间为："+ System.currentTimeMillis()+"此时i的值为："+threadSuspend.getI());
            //线程停止，终止线程
            thread.interrupt();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
