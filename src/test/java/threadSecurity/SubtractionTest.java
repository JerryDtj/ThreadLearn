package threadSecurity;

public class SubtractionTest {

    public static void main(String[] args) {
        NumSubtractionThread numSubtractionThread = new NumSubtractionThread();
        for (int i =5;i>-1;i--){
            Thread thread = new Thread(numSubtractionThread,"a"+i);
            thread.start();
        }
    }
}
