package waitAndnotify.twoproduct_onecustmer_list;

public class ThreadP1  implements Runnable{
    private MyStack myStack;

    public ThreadP1(MyStack stack){
        this.myStack = stack;
    }

    @Override
    public void run() {
        while (true){
            myStack.push();
        }
    }
}
