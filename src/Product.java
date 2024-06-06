import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Product {
    String productName;
    String category;
    int availableCount;
    int price;


    Product(int price, int availableCount, String Category, String productName) {
        this.price = price;
        this.availableCount = availableCount;
        this.category = Category;
        this.productName = productName;
    }

    public static void addProduct(Product p, ArrayList<Product> productList) {

        productList.add(p);
    }

    public static void editProduct() {
    }

    public static void deleteProduct() {
    }

    public static void updateProduct() {
    }

    public static void viewProduct() {
    }

    public static void availableProduct() {
    }

    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();


        Product p1 = new Product(100, 10, "Food", "Biscuits");
        Product p2 = new Product(100, 10, "Food", "Chocolate");
        Product p3 = new Product(100, 10, "Food", "Soap");
        addProduct(p1, productList);
        addProduct(p2, productList);
        addProduct(p3, productList);
    }
}
