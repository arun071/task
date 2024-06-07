import java.util.HashMap;

public class User {

    private String EmailId;
    private String Password;
    public static HashMap<String, String> db = new HashMap<>();

    public static boolean signUp(String email, String pass) {
        if (db.containsKey(email)) {
            System.out.println("user already Registred go to signin");
            return false;

        } else {
            db.put(email, pass);
            System.out.println("Account Created Sucessfully");
            return true;
        }
    }

    public static void signIn(String email, String pass) {

        if (db.containsKey(email)) {
            if (db.get(email).equals(pass)) {
                System.out.println(email.equals("admin") ? "Welcome AdminPanel " + email : "Welcome User " + email);
            } else {
                System.out.println("In correct Password");
            }
        } else {
            System.out.println("this Acc is Not Registered ... select option 1 for signup");
        }
    }

}