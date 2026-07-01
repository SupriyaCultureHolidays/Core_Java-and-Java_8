/*
 * Question 3 (Product)
 * একটি Product class
 * Properties: id, name, price, quantity
 * Method: display() -> সব field ও total price (price*quantity) দেখাবে
 *
 * Output:
 * Product: Pen, Price: 10, Qty: 5, Total: 50
 */
public class Demo {
    public static void main(String[] args) {
        Product product = new Product(1, "Pen", 10, 5);
        product.display();
    }
}