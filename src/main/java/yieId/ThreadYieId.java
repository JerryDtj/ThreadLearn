package yieId;

public class ThreadYieId implements Runnable {
    @Override
    public void run() {
        long begin = System.currentTimeMillis();
        for (int i=0;i<50000;i++){
            Thread.yield();
        }
        Long end = System.currentTimeMillis();
        System.out.println("加入yield方法后用时:"+(end-begin)+"毫秒");
        begin = System.currentTimeMillis();
        for (int i=0;i<50000;i++){

        }
        end = System.currentTimeMillis();
        System.out.println("去掉yidld方法后用时:"+(end-begin)+"毫秒");
    }
}
