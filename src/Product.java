abstract class Product {
    int id;
    double unitPrice;
    double discountRate;
    int stock;
    String productName;
    Brand brand;

    public Product(int id, double unitPrice, double discountRate, int stock, String productName, Brand brand) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stock = stock;
        this.productName = productName;
        this.brand = brand;
    }

    public abstract void displayDetails();
}
