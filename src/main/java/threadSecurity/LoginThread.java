package threadSecurity;

public class LoginThread {
    private static String userNameSaf;
    private static String passwordSaf;

    public static boolean login(String username,String pwd){
        try {
            userNameSaf = username;
            if (userNameSaf.equals("a")){
                Thread.sleep(5000);
            }
            passwordSaf = pwd;
            System.out.println("userName="+userNameSaf+" password="+passwordSaf);
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }
}
