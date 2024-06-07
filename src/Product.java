import java.util.ArrayList;

public class Product {
    private String productName;
    private String category;
    private int availableCount;
    private int price;
    private final int productId;
    private static int genrateId = 1;

    static ArrayList<Product> productList = new ArrayList<>();


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

    public String getCategory() {
        return category;
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

    public void viewProduct() {
        System.out.println("\n\nProduct id: " + productId + "\nProduct Name: " + productName + "\nCategory: " + category + "\nPrice: " + price + " Rs" + "\nAvailable Count: " + availableCount);
    }

    public static void availableProduct() {
        for (Product item : productList) {
            item.viewProduct();
        }
    }

    public static void main(String[] args) {

        Product.addProduct("biscuits", "food", 10, 100);
        Product.addProduct("Salt", "food", 10, 100);
        Product.addProduct("biscuits", "food", 10, 100);
        Product.addProduct("biscuits", "food", 10, 100);
        Product.editProduct(2, 0);
        Product.getProduct(0);
    }

}