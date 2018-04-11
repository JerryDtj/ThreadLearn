package lock.morecondition;

public class Run {

    public static void main(String[] args) {
        try {
            MyService myService = new MyService();
            Thread a = new Thread(new ThreadA(myService));
            a.setName("a");
            Thread b = new Thread(new ThreadB(myService));
            b.setName("b");
            a.start();
            b.start();

            Thread.sleep(3000);
            myService.signalA();
//            myService.signalB();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
