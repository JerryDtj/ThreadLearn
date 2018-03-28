package waitAndnotify.oneproduct_twocustmer_list;

public class ThreadP  implements Runnable{
    private MyStack myStack;

    public ThreadP(MyStack stack){
        this.myStack = stack;
    }

    @Override
    public void run() {
        while (true){
            myStack.push();
        }
    }
}
