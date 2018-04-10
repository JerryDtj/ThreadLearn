package join.joinMore;

public class Test {
    public static void main(String[] args) {
        try {
            ThreadB b = new ThreadB();
            ThreadA a = new ThreadA(b);
            a.start();
            b.start();
            b.join(2000);
            System.out.println("main end");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
