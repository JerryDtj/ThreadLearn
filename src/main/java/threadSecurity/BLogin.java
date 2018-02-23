package threadSecurity;


public class BLogin implements Runnable {


    @Override
    public void run() {
        LoginThread.login("b","bb");
    }
}
