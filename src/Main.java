import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Amazon");
        Scanner sc = new Scanner(System.in);
        String email;
        String pass;
        User user = new User();
        user.db.put("admin", "pass");

        while (true) {
            System.out.println(
                    "----------------------\nChoose a Option" +
                    "\n1.For SignUp" +
                    "\n2.For SigIn" +
                    "\n3.For Exit" +
                    "\n----------------------");
            int opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("SignUp Page");
                    System.out.println("Enter your Email");
                    email = sc.next();
                    System.out.println("Enter your Password");
                    pass = sc.next();
                    user.signUp(email, pass);
                    break;
                case 2:
                    System.out.println("SignIn Page");
                    System.out.println("Enter your Email");
                    email = sc.next();
                    System.out.println("Enter your Password");
                    pass = sc.next();
                    user.signIn(email, pass);
                    break;
                case 3:
                    System.out.println("ThankYou");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choices");
            }
        }
    }
}