package waitAndnotify.product_custmer_string;

public class Product {
    private String lock;

    public Product(String lock){
        this.lock = lock;
    }

    public void add(){
        try {
            synchronized (lock){
                if (!ValueObject.value.equals("")){
                    lock.wait();
                }
                String value = System.currentTimeMillis()+"-"+System.nanoTime();
                System.out.println("set的值为："+value);
                ValueObject.value = value;
                lock.notify();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
