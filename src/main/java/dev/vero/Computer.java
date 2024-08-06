package dev.vero;

public class Computer {
    private String brand;
    private String memory;
    private String processor;
    private String operatingSystem;
    private double price;

    public Computer(String brand, String memory, String processor, String operatingSystem, double price) {
        this.brand = brand;
        this.memory = memory;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getMemory() {
        return memory;
    }

    public String getProcessor() {
        return processor;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", memory='" + memory + '\'' +
                ", processor='" + processor + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", price=" + price +
                '}';
    }
}
