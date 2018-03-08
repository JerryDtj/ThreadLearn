package safe;

public class Threadb implements Runnable {
    private PrivateSafe safe;

    public Threadb(PrivateSafe safe){
        this.safe = safe;
    }

    @Override
    public void run() {
        safe.Num("b");
    }
}
