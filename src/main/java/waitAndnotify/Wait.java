package waitAndnotify;

public class Wait {
    public static void main(String[] args) {
        String s = "1";
        try {
            s.wait();
            //会抛出IllegalMonitorStateException 因为wait方法需要获得对象锁后才会执行wait方法。当先没有对象锁，所以报错
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
