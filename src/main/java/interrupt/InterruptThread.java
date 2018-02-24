package interrupt;

public class InterruptThread extends Thread {
    @Override
    public void run() {
        int i=500;
        while (i>0){
            System.out.println(i--);
        }
    }
}
