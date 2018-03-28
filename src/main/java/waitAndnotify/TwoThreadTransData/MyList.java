package waitAndnotify.TwoThreadTransData;

import java.util.ArrayList;
import java.util.List;

public class MyList {
    public List<String> list = new ArrayList<>();

    public void add(String s){
        this.list.add(s);
    }

    public Integer size(){
        return this.list.size();
    }
}
