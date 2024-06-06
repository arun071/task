import java.util.HashMap;

public class User {

    private String EmailId;
    private String Password;
    public HashMap<String, String> db = new HashMap<>();

    public void signUp(String email, String pass) {
        if (db.containsKey(email)) {
            System.out.println("user already Registred go to signin");

        } else {
            db.put(email, pass);
        }
        System.out.println("Account Created Sucessfully");
    }

    public void signIn(String email, String pass) {

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