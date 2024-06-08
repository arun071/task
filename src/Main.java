import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Amazon");
        Scanner sc = new Scanner(System.in);
        String email;
        String pass;
        User.addAdmin();
        Product.addProduct("Soap", "Bath", 30, 99);
        Product.addProduct("Biscuits", "Food", 10, 19);
        Product.addProduct("Cake", "Snack", 50, 2);
        User.SignUp("arun", "1");
        while (true) {
            System.out.println(
                    "----------------------\nChoose a Option" +
                            "\n1.SignUp" +
                            "\n2.SigIn" +
                            "\n3.Forgot Password" +
                            "\n4.UserList" +
                            "\n0.Exit" +
                            "\n----------------------");
            int opt = sc.nextInt();
            switch (opt) {
                case 0:
                    System.out.println("ThankYou");
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("SignUp Page\nEnter your Email");
                    email = sc.next();
                    System.out.println("Enter your Password");
                    pass = sc.next();
                    User.SignUp(email, pass);
                    break;
                case 2:
                    System.out.println("SignIn Page");
                    System.out.println("Enter your Email");
                    email = sc.next();
                    System.out.println("Enter your Password");
                    pass = sc.next();
                    User.SignIn(email, pass);
                    break;
                case 3:
                    System.out.println("Enter Your Email");
                    email = sc.next();
                    System.out.println("Enter New Password");
                    pass = sc.next();
                    User.forgotPassword(email, pass);
                    break;
                case 4:
                    User.viewUserList();
                    break;
                default:
                    System.out.println("Invalid Choices");
                    break;
            }
        }
    }
}