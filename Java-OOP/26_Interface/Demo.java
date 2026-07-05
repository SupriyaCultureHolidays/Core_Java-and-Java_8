/*
 * Question 25 (25_Interface) — Vehicle Interface
 *
 * Vehicle interface-এ start() ও stop() method রাখো, সাথে একটা
 * default method fuelType() ও রাখো (interface-এর default method)।
 * Car আর Bike implement করবে, দরকার হলে fuelType() override করবে।
 *
 * Output:
 * Car started
 * Car stopped
 * Bike started
 * Bike stopped
 */
public class Demo {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.stop();
        v.fuelType(); // Car a ata nei, tai print korche na
    }
}
