package Timer.schedule;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

public class run {
    public static void main(String[] args) {
        System.out.println("now:"+System.currentTimeMillis());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.SECOND,10);
        Date runTime = calendar.getTime();

        TimerTask timerTask = new TimerTask();
        Timer timer = new Timer();
        timer.schedule(timerTask,runTime);
    }
}
