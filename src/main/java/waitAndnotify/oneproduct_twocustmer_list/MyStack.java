package waitAndnotify.oneproduct_twocustmer_list;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List<String> list = new ArrayList<>();
    private int i = 0;

    public synchronized void push(){
        try {
            if (list.size()>=1){
                System.out.println("push wait");
                this.wait();
            }
            String s = System.currentTimeMillis()+"-"+System.nanoTime();
            System.out.println("add i["+s+"]");
            list.add(s);
            this.notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void pop(){
        try {
            if (list.size()==0){
                System.out.println("pop wait");
                this.wait();
            }
            System.out.println("pop i["+list.get(0)+"]");
            list.remove(0);
            this.notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
