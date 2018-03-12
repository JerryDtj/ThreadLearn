package syncBlock;

public class ThreadB implements Runnable {
    private MyOneList myOneList;

    public ThreadB(MyOneList myOneList){
        this.myOneList = myOneList;
    }

    @Override
    public void run() {
        NumService service = new NumService();
        service.addOne(this.myOneList,"threadA");
    }
}
