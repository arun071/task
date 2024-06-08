import java.util.ArrayList;
import java.util.HashMap;

public class User {
    private final String EmailId;
    private String Password;
    private final static HashMap<String, String> db = new HashMap<>();
    private final static ArrayList<User> UserList = new ArrayList<>();

    public String getEmailId() {
        return EmailId;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public User(String emailId, String password) {
        EmailId = emailId;
        Password = password;
        db.put(emailId, password);
    }

    public static void SignUp(String emailId, String password) {
        if (db.containsKey(emailId)) {
            System.out.println("user already Registred go to signin");
        } else {
            UserList.add(new User(emailId, password));
            System.out.println("Account Created Sucessfully");
            User.SignIn(emailId,password);
        }
    }

    public static void SignIn(String emailId, String password) {
        if (db.containsKey(emailId)) {
            if (db.get(emailId).equals(password))
                System.out.println(emailId.equals("admin") ? "Welcome AdminPanel " + emailId : "Welcome User " + emailId);
            else
                System.out.println("In correct Password");
        } else
            System.out.println("this Acc is Not Registered ... select option 1 for signup");
    }

    public static void forgotPassword(String emailId, String password) {
        User currentUser = null;
        for (User user : UserList) {
            if (user.getEmailId().equals(emailId)) {
                currentUser = user;
            }
        }
        if (currentUser != null) {
            currentUser.setPassword(password);
            db.replace(emailId,password);
        }
        else
            System.out.println("User Not Found");

    }


    public void viewUser() {
        System.out.println("\nUser id: " + getEmailId());
        System.out.println("\nPassword " + getPassword());
    }

    public static void viewUserList() {
        for (User currentUser : UserList)
            currentUser.viewUser();
    }
}