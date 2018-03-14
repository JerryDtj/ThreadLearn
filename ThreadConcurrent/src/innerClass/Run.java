package innerClass;

public class Run {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.setName("name");
        publicClass.setPwd("pwd");
        System.out.println(publicClass.getName()+" "+publicClass.getPwd());
        PublicClass.PrivateClass privateClass = publicClass.new PrivateClass();
        privateClass.setAddress("address");
        privateClass.setAge("age");
        System.out.println(privateClass.getAddress()+" "+privateClass.getAge());
    }
}
