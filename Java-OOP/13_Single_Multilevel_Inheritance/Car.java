public class Car extends Vehicle {
    String model;

    Car(String model, String brand) {
        super(brand);
        this.model = model;
    }
    void display(){
        System.err.println("Brand: " + brand + " Model: " + model);
    }
}
