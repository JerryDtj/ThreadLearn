package waitAndnotify.moreproduct_morecustmer_list;

public class C {
    private MyStack myStack;

    public C(MyStack stack){
        this.myStack = stack;
    }

   public void popService(){
        myStack.pop();
   }
}
