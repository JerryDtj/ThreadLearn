package waitAndnotify.moreproduct_morecustmer_list;

public class ThreadC extends Thread{
    private C r;

    public ThreadC(C r){
        this.r = r;
    }

    @Override
    public void run() {
        while (true){
            r.popService();
        }
    }
}
