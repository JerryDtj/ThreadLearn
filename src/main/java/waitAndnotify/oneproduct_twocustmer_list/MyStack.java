package waitAndnotify.oneproduct_twocustmer_list;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List<String> list = new ArrayList<>();
    private int i = 0;

    public synchronized void push(){
        try {
            while (list.size()==1){
                this.wait();
            }
            list.add("anyString="+Math.random());
            this.notify();
            System.out.println("push="+list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized String pop(){
        String returnValue="";
        try {
            if (list.size()==0){
                System.out.println("pop操作中的："+Thread.currentThread().getName()+"线程呈wait状态");
                this.wait();
            }
            System.out.println("pop i["+list.get(0)+"]");
            returnValue = list.get(0);
            list.remove(0);
            this.notify();
            System.out.println("pop="+list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }


}
