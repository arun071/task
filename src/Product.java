import java.util.ArrayList;
import java.util.HashMap;

public class Product {
    private String productName;
    private String category;
    private int availableCount;
    private int price;
    private final int productId;
    private static int genrateId = 1;

    static ArrayList<Product> productList = new ArrayList<>();
    static HashMap<String, Integer> bills = new HashMap<>();

    Product(String productName, String Category, int price, int availableCount) {
        this.price = price;
        this.availableCount = availableCount;
        this.category = Category;
        this.productName = productName;
        this.productId = genrateId++;
    }

    public String getProductName() {
        return productName;
    }

    public int getPrice() {
        return price;
    }

    public int getAvailableCount() {
        return availableCount;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAvailableCount(int availableCount) {
        this.availableCount = availableCount;
    }

    private int getProductId() {
        return productId;
    }

    public static void addProduct(String productName, String Category, int price, int availableCount) {
        productList.add(new Product(productName, Category, price, availableCount));
        System.out.println("Product: " + productName + " Added Successfully");
    }

    public static void editProduct(int inputId, String name, String category, int price, int availableCount) {
        Product P = null;
        for (Product item : productList) {
            if (item.getProductId() == inputId) {
                P = item;
            }
        }
        if (P != null) {
            P.setProductName(name);
            P.setCategory(category);
            P.setPrice(price);
            P.setAvailableCount(availableCount);
        }
    }

    public static int buyProduct(int inputId, int Count) {
        Product P = null;
        for (Product item : productList) {
            if (item.getProductId() == inputId) {
                P = item;
            }
        }
        if (P != null) {
            if (P.getAvailableCount() >= Count) {
                int amt = P.getPrice() * Count;
                System.out.println(P.getProductName() + " " + Count + " * " + P.getPrice() + " = " + amt);
                P.setAvailableCount(P.getAvailableCount() - Count);
                return amt;
            } else
                System.out.println("Invalid Count");
        }
        return 0;
    }

    public static void deleteProduct(int inputId) {
        Product P = null;
        for (Product item : productList) {
            if (item.getProductId() == inputId) {
                P = item;
            }
        }
        if (P != null) {
            productList.remove(P.getProductId() - 1);
            System.out.println(P.getProductName() + " is Deleted Successfully");
        }
    }

    public static void editProduct(int inputId, int availableCount) {
        Product P = null;
        for (Product item : productList) {
            if (item.getProductId() == inputId) {
                P = item;
            }
        }
        if (P != null) {
            P.setAvailableCount(availableCount);
        }
    }

    public static void getProduct(int id) {
        for (Product item : productList) {
            if (item.getAvailableCount() != id)
                item.viewProduct();
        }
    }

    public static void getBills(String Email) {
        if (bills.containsKey(Email)) {
            System.out.println(bills.get(Email));
        }
    }

    public void viewProduct() {
        System.out.println("\n\nProduct id: " + productId + "\nProduct Name: " + productName + "\nCategory: " + category + "\nPrice: " + price + " Rs" + "\nAvailable Count: " + availableCount);
    }

    public static void availableProduct() {
        for (Product item : productList) {
            if (item.getAvailableCount() > 0)
                item.viewProduct();
        }
    }

}