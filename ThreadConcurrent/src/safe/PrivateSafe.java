package safe;

public class PrivateSafe {
    public int num =0;
    public void Num(String name){
        try {
            if (name.equals("a")){
                num = 100;
                System.out.println("a in");
                Thread.sleep(2000);
            }else {
                num = 200;
                System.out.println("b in");
            }
            System.out.println("name="+name+";num="+num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
