package syncBlock;

public class ThreadC implements Runnable {
    private MyOneList myOneList;
    public ThreadC(MyOneList myOneList){
        this.myOneList = myOneList;
    }

    @Override
    public void run() {
        if (myOneList.getSize()<1){
            //模拟从远端取数据花费2s
            myOneList.add("s");
        }
    }
}
