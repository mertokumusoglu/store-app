public class MobilePhone extends Product{
    String memory;
    double screenSize;
    int batteryPower;
    int ram;
    String color;

    public MobilePhone(int id, double unitPrice, double discountRate, int stock, String productName,
                     Brand brand, String memory, double screenSize, int batteryPower, int ram, String color) {
        super(id, unitPrice, discountRate, stock, productName, brand);
        this.memory = memory;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.color = color;
    }
    @Override
    public void displayDetails() {
        System.out.printf("ID: %d, Product: %s, Brand: %s, Price: %.2f, Stock: %d, Discount: %.2f%n",
                id, productName, brand.getTitle(), unitPrice, stock, discountRate);
        System.out.printf("Memory: %s, Screen Size: %.1f inch, Battery Power: %d, RAM: %d MB, Color: %s%n",
                memory, screenSize, batteryPower, ram, color);
    }
}
