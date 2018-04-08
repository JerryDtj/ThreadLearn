package join.sleep;

public class Test {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            Thread a = new Thread(new ThreadA(b));
            a.start();
            Thread.sleep(1000);
            Thread c = new Thread(new ThreadC(b));
            c.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
