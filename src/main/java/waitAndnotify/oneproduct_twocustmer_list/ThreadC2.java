package waitAndnotify.oneproduct_twocustmer_list;

public class ThreadC2 implements Runnable{
    private MyStack myStack;

    public ThreadC2(MyStack stack){
        this.myStack = stack;
    }

    @Override
    public void run() {
        while (true){
            myStack.pop();
        }
    }
}
