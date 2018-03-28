package waitAndnotify.twoproduct_onecustmer_list;

public class ThreadC implements Runnable{
    private MyStack myStack;

    public ThreadC(MyStack stack){
        this.myStack = stack;
    }

    @Override
    public void run() {
        while (true){
            myStack.pop();
        }
    }
}
