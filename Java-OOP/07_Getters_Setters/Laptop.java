public class Laptop {
    // brand, ram, ssd, processor
    String brand;
    String ram;
    String ssd;
    String processor;

    Laptop(String ram, String ssd, String processor) {
        this.ssd = ssd;
        this.processor = processor;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    void display() {
        System.out.println("Brand: " + brand + ", RAM: " + ram + ", SSD: " + ssd + ", Processor: " + processor);
    }

}
