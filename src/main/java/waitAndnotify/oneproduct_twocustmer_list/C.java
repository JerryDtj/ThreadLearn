package waitAndnotify.oneproduct_twocustmer_list;

public class C {
    private MyStack myStack;

    public C(MyStack stack){
        this.myStack = stack;
    }

   public void popService(){
        myStack.pop();
   }
}
