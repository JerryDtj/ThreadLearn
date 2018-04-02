package waitAndnotify.moreproduct_morecustmer_list;

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
            this.notifyAll();
            System.out.println("push="+list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized String pop(){
        String returnValue="";
        try {
            while (list.size()==0){//如果是if的话，不会执行判断，直接进行remove操作。
                System.out.println("pop操作中的："+Thread.currentThread().getName()+"线程呈wait状态");
                this.wait();
            }
            System.out.println("pop i["+list.get(0)+"]");
            returnValue = list.get(0);
            list.remove(0);
            this.notifyAll();//如果是notify的话，有可能唤醒同类
            System.out.println("pop="+list.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return returnValue;
    }


}
