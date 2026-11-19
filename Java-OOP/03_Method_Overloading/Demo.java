/*
 * Question 3 (03_Method_Overloading) — Product Total (Overloading)
 *
 * Product class (id, name, price, quantity)।
 *
 * একই নামে তিনটা calculateTotal() method overload করো:
 * - calculateTotal() → price * quantity
 * - calculateTotal(double discountPercent) → discount বাদ দিয়ে total
 * - calculateTotal(double discountPercent, int deliveryCharge) → discount বাদ দিয়ে, delivery charge যোগ করে total
 *
 * Demo.java থেকে তিনটাই call করো — compiler parameter দেখে ঠিক method বেছে নেবে (compile-time polymorphism)।
 * Bonus: শুধু return type আলাদা করে overload করলে কী error আসে দেখো।
 *
 * Output (Pen, price 10, qty 5):
 * Total: 50
 * Total after 10% discount: 45.0
 * Total after 10% discount + 20 delivery: 65.0
 */
public class Demo {
    public static void main(String[] args) {
        Product product = new Product(1, "Pen", 10, 5);
        product.display();
    }
}