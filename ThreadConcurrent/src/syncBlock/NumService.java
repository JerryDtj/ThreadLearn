package syncBlock;

public class NumService {
    public MyOneList addOne(MyOneList myOneList,String s){
        try {
            synchronized (myOneList){//虽然是多个线程，但是都是同一个myOneList对象，所以这里可以对myOneList对象加synchronized关键字可以保持同步
                if (myOneList.getSize()<1){
                    //模拟从远端取数据花费2s
                    Thread.sleep(2000);
                    myOneList.add(s);
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myOneList;
    }
}
