package join;

public class MyThread implements Runnable {
    @Override
    public void run() {
        try {
            int secondValue = (int) (Math.random()*10000);
            Thread.sleep(secondValue);
            System.out.println("wait"+secondValue+" run end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
