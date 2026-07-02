/*
 * Question 13
 * Vehicle
 *   ↓
 * Car
 *
 * Vehicle: brand
 * Car: model
 * Car object বানিয়ে brand+model একসাথে দেখাও।
 *
 * Output:
 * Brand: Toyota, Model: Corolla
 */
public class Demo {
    public static void main(String[] args) {
        Car c = new Car("Suzuki014", "Suzuki");
        c.display();
    }
}
