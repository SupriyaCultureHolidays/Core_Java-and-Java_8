public class Car extends Vehicle {
    String model;
    Car(String brand, String model) {
        super(brand);
        this.model = model;
    }
    @Override 
    void display(){
        System.out.println("Brand: " + brand + ", Model: " + model);
    }
}