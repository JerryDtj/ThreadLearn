package threadSecurity;


public class ALogin implements Runnable {

    @Override
    public void run() {
        LoginThread.login("a","aa");
    }
}
