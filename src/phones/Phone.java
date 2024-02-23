package phones;

import brands.Brand;

public class Phone {
    int phoneID;
    Brand brand;
    String name;
    int stock;
    int discountRate;
    double screenSize;
    int batteryCapacity;
    int ram;
    int storageCapacity;
    String color;
    double price;

    public Phone(int phoneID, Brand brand, String name, int stock, int discountRate, double screenSize, int batteryCapacity, int ram, int storageCapacity,String color, double price) {
        this.phoneID = phoneID;
        this.brand = brand;
        this.name = name;
        this.stock = stock;
        this.discountRate = discountRate;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
        this.ram = ram;
        this.storageCapacity = storageCapacity;
        this.color = color;
        this.price = price;
    }


    // getters / setters
    public int getPhoneID() {
        return phoneID;
    }

    public void setPhoneID(int phoneID) {
        this.phoneID = phoneID;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
