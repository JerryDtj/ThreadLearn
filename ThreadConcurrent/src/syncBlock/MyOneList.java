package syncBlock;

import java.util.ArrayList;
import java.util.List;

public class MyOneList {
    private List list = new ArrayList();
    synchronized public void add(String s){
        this.list.add(s);
    }
    public synchronized int getSize(){
        return list.size();
    }
}
