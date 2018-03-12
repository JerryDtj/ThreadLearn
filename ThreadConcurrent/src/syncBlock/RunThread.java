package syncBlock;


public class RunThread {
    public static void main(String[] args) {
        try {
            MyOneList oneList = new MyOneList();
            Thread t1 = new Thread(new ThreadA(oneList));
            t1.start();
            Thread t2 = new Thread(new ThreadB(oneList));
            t2.start();
            Thread t3 = new Thread(new ThreadB(oneList));
            t3.start();
            Thread.sleep(6000);




            System.out.println(oneList.getSize());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
