import java.util.Scanner;

public class Screen {
    private static final Scanner sc = new Scanner(System.in);
    static String productName;
    static String category;
    static int productId;
    static int price;
    static int count;

    public static void AdminScreen() {
        while (true) {
            System.out.print("Welcome AdminPanel\n1.Add Product\n2.Edit Product\n3.Update Count\n4.Delete Product\n5.Available Product\n");
            int num = sc.nextInt();
            switch (num) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.print("Product Name: ");
                    productName = sc.next();
                    System.out.print("Category: ");
                    category = sc.next();
                    System.out.print("Price: ");
                    price = sc.nextInt();
                    System.out.print("AvailableCount: ");
                    count = sc.nextInt();
                    Product.addProduct(productName, category, price, count);
                    break;
                case 2:
                    System.out.print("Product id: ");
                    productId = sc.nextInt();
                    System.out.print("Product Name: ");
                    productName = sc.next();
                    System.out.print("Category: ");
                    category = sc.next();
                    System.out.print("Price: ");
                    price = sc.nextInt();
                    System.out.print("AvailableCount: ");
                    count = sc.nextInt();
                    Product.editProduct(productId, productName, category, price, count);
                    break;
                case 3:
                    System.out.print("Product id: ");
                    productId = sc.nextInt();
                    System.out.print("UpdatedCount: ");
                    count = sc.nextInt();
                    Product.editProduct(productId, count);
                    break;
                case 4:
                    System.out.print("Product id: ");
                    productId = sc.nextInt();
                    Product.deleteProduct(productId);
                    break;
                case 5:
                    Product.availableProduct();
                    break;
                default:
                    System.out.print("Invalid");
            }
        }
    }

    public static void UserScreen() {
        while (true) {
            System.out.print("Welcome User\n1.Buy Product\n2.View Cart\n3.Update Count\n4.Delete Product\n5.Available Product\n");
            int num = sc.nextInt();
            switch (num) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    Product.availableProduct();
                    System.out.print("How Many Unique Product Going To buy: ");
                    int n = sc.nextInt();
                    int totalAmount = 0;
                    for (int i = 0; i < n; i++) {
                        System.out.print("Product Id ");
                        productId = sc.nextInt();
                        System.out.print("Count ");
                        count = sc.nextInt();
                        totalAmount += Product.buyProduct(productId, count);
                    }
                    System.out.println("Total Amount: " + totalAmount);
                    Product.bills.put(User.getEmailId(), totalAmount);
                    break;
                case 2:
                    Product.getBills(User.getEmailId());
                    break;
                case 3:
                    System.out.print("Product id: ");
                    productId = sc.nextInt();
                    System.out.print("UpdatedCount: ");
                    count = sc.nextInt();
                    Product.editProduct(productId, count);
                    break;
                case 4:
                    System.out.print("Product id: ");
                    productId = sc.nextInt();
                    Product.deleteProduct(productId);
                    break;
                case 5:
                    Product.availableProduct();
                    break;
                default:
                    System.out.print("Invalid");
            }
        }
    }

}
