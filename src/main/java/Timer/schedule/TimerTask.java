package Timer.schedule;

public class TimerTask extends java.util.TimerTask {
    @Override
    public void run() {
        System.out.println(" timerTask in"+System.currentTimeMillis());
    }
}
