abstract class Product {
    int id;
    double unitPrice;
    double discountRate;
    int stock;
    String modelName;
    Brand brand;

    public Product(int id, double unitPrice, double discountRate, int stock, String modelName, Brand brand) {
        this.id = id;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stock = stock;
        this.modelName = modelName;
        this.brand = brand;
    }

    public abstract void displayDetails();
}
