package lock.reedtranlock;

import javax.xml.ws.Service;

public class MyThread implements Runnable {
    private MyService myService;

    public MyThread(MyService myService){
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }
}
