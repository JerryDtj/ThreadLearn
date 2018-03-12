package syncBlock;

public class ThreadA implements Runnable {
    private MyOneList myOneList;

    public ThreadA(MyOneList myOneList){
        this.myOneList = myOneList;
    }

    @Override
    public void run() {
        NumService service = new NumService();
        service.addOne(this.myOneList,"threadA");
    }
}
