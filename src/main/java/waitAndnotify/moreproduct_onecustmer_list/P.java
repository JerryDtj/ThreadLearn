package waitAndnotify.moreproduct_onecustmer_list;

public class P{
    private MyStack myStack;

    public P(MyStack stack){
        this.myStack = stack;
    }

   public void pushService(){
        myStack.push();
   }
}
