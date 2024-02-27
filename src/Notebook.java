public class Notebook extends Product{
    int ram;
    String storage;
    double screenSize;

    public Notebook(int id, double unitPrice, double discountRate, int stock, String productName,
                    Brand brand, int ram, String storage, double screenSize) {
        super(id, unitPrice, discountRate, stock, productName, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    @Override
    public void displayDetails() {
        System.out.format("ID: %d, Product: %s, Brand: %s, Price: %.2f, Stock: %d, Discount: %.2f%n",
                id, productName, brand.getTitle(), unitPrice, stock, discountRate);
        System.out.format("RAM: %d GB, Storage: %s, Screen Size: %.1f inch%n", ram, storage, screenSize);
    }
}
