package join;

public class Test {
    public static void main(String[] args) {
        try {
            Thread thread = new Thread(new MyThread());
            thread.start();
            thread.join();
            System.out.println("main end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
