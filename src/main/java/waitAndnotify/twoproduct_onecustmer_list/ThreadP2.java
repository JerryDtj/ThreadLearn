package waitAndnotify.twoproduct_onecustmer_list;

public class ThreadP2 implements Runnable{
    private MyStack myStack;

    public ThreadP2(MyStack stack){
        this.myStack = stack;
    }

    @Override
    public void run() {
        while (true){
            myStack.push();
        }
    }
}
