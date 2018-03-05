import priority.ThreadA;
import priority.ThreadB;
import priority.ThreadC;

public class PriorityTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadA());
        t1.start();
        Thread t2 = new Thread(new ThreadB());
        t2.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        Thread t3 = new Thread(new ThreadB());
        t3.start();
        Thread t4 = new Thread(new ThreadC());//直接继承是无法改变线程的优先级的
        t4.start();

        Thread.currentThread().setPriority(6);//改变当前启动线程的优先级才有效果
        Thread t5 = new Thread(new ThreadA());
        t5.start();
        Thread t6 = new Thread(new ThreadB());
        t6.start();


//        t1.setPriority(Thread.NORM_PRIORITY);
//        t1.start();
//        t2.start();
    }
}
