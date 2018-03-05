package yieId;

public class ThreadYieIdTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadYieId());
        thread.start();
    }
}
