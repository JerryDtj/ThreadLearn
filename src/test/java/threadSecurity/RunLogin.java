package threadSecurity;

public class RunLogin {
    public static void main(String[] args) {
        Thread aLogin = new Thread(new ALogin());
        aLogin.start();
        Thread bLogin = new Thread(new BLogin());
        bLogin.start();
    }
}
