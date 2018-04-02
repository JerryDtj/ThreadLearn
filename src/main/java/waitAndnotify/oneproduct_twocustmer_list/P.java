package waitAndnotify.oneproduct_twocustmer_list;

public class P{
    private MyStack myStack;

    public P(MyStack stack){
        this.myStack = stack;
    }

   public void pushService(){
        myStack.push();
   }
}
