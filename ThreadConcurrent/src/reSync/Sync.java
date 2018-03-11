package reSync;

public class Sync {
    public synchronized void serviceA(){
        System.out.println("serviceA in");
        serviceB();
        System.out.println("serviceA end");
    }
    public synchronized void serviceB(){
        System.out.println("serviceB in");
        serviceC();
        System.out.println("serviceB end");
    }
    public synchronized void serviceC(){
        System.out.println("serviceC in");
    }

}
