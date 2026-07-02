/*
 * Question 15
 * Payment
 *   ↓
 * CreditCard
 *   ↓
 * UPI
 *
 * সব payment() override করবে। প্রতি ক্লাস নিজের মতো message দেবে।
 * UPI object দিয়ে কল করলে সবচেয়ে নিচের (UPI-এর) override version চলবে।
 *
 * Output:
 * Paid using UPI
 */
public class Demo {
    public static void main(String[] args) {
        UPI u = new UPI();
        u.payment();

    }
}
