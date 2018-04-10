package threadlocal;

public class Run {
    public static ThreadLocal threadLocal = new ThreadLocal();
    InheritableThreadLocal inheritableThreadLocal = new InheritableThreadLocal();

    public static void main(String[] args) {
        if (threadLocal.get()==null){
            System.out.println("threadLocal is null");
            threadLocal.set("我的值");
        }
        System.out.println(threadLocal.get());
    }
}

