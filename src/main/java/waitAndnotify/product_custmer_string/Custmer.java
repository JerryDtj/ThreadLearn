package waitAndnotify.product_custmer_string;

public class Custmer {
    private String lock;

    public Custmer(String lock){
        this.lock = lock;
    }

    public void get(){
        try {
            synchronized (lock){
                if (ValueObject.value.equals("")){
                    lock.wait();
                }
                String value = ValueObject.value;
                System.out.println("get的值为："+value);
                ValueObject.value = "";
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
