package waitAndnotify.oneproduct_twocustmer_list;

public class ThreadC1 implements Runnable{
    private MyStack myStack;

    public ThreadC1(MyStack stack){
        this.myStack = stack;
    }

    @Override
    public void run() {
        while (true){
            myStack.pop();
        }
    }
}
