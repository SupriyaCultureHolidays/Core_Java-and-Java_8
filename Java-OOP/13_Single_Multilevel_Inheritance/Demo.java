/*
 * Question 13 (13_Single_Multilevel_Inheritance) — Vehicle → Car → ElectricCar
 *
 * Single:     Vehicle → Car
 * Multilevel: Vehicle → Car → ElectricCar
 *
 * - Vehicle: brand
 * - Car: model
 * - ElectricCar (নতুন class): batteryKwh
 * - প্রতিটা constructor super(...) দিয়ে parent constructor call করবে
 * - getDetails() → String return করবে; child class override করে super.getDetails() এর সাথে নিজের field যোগ করবে
 *
 * Demo.java-তে একটা Car আর একটা ElectricCar বানিয়ে print করো।
 *
 * Output:
 * Brand: Toyota, Model: Corolla
 * Brand: Tesla, Model: Model 3, Battery: 75kWh
 */
public class Demo {
    public static void main(String[] arg) {
        Car c = new Car("Toyota", "Corolla");
        c.display();
    }
}
