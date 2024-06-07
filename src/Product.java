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

    public static void editProduct() {
    }

    public static void deleteProduct() {
    }

    public void updatecount(int count) {
        this.availableCount = count;

    }

    public void viewProduct() {
        System.out.println("Product Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Available Count: " + availableCount);
    }

    public static void availableProduct() {

    }
}

class MyClass {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<>();
        ArrayList<ArrayList<Product>> productdb = new ArrayList<>();
        Product p1 = new Product(100, 10, "Food", "Soap");
        Product p2 = new Product(100, 10, "Food", "Chocolate");
        Product p3 = new Product(100, 10, "Food", "Biscuits");

        p1.viewProduct();
        System.out.println("");
        p1.updatecount(2);
        System.out.println("");
        p1.viewProduct();


    }
}