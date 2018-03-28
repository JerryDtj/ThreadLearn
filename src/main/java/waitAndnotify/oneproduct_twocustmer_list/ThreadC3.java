package waitAndnotify.oneproduct_twocustmer_list;

public class ThreadC3 implements Runnable{
    private MyStack myStack;

    public ThreadC3(MyStack stack){
        this.myStack = stack;
    }

    @Override
    public void run() {
        while (true){
            myStack.pop();
        }
    }
}
