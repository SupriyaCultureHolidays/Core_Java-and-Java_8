/*
 * Extra Practice Q3 — Abstraction (Abstract Class) + Upcasting
 *
 * Abstract class PaymentMethod
 *   - abstract method: pay(double amount)
 *   - concrete method: printReceipt(double amount) -> "Receipt: Paid " + amount
 *     print করবে (এটা abstract class-এর মধ্যেই সরাসরি লেখা থাকবে, override লাগবে না)
 *
 * দুটো subclass বানাও:
 *   CreditCardPayment -> pay() override করে "Paying <amount> using Credit Card" print করবে
 *   UpiPayment         -> pay() override করে "Paying <amount> using UPI" print করবে
 *
 * Demo.java তে PaymentMethod reference (upcasting) দিয়ে দুটো object বানাও,
 * প্রতিটার জন্য pay() ও তারপর printReceipt() call করো।
 *
 * Output (amount = 500):
 * Paying 500.0 using Credit Card
 * Receipt: Paid 500.0
 * Paying 500.0 using UPI
 * Receipt: Paid 500.0
 */
public class Demo {
    public static void main(String[] args) {
        // TODO: abstract class PaymentMethod ও দুটো subclass বানাও
        // TODO: PaymentMethod reference দিয়ে object বানিয়ে pay() ও printReceipt() call করো
        PaymentMethod p = new CreditCardPayment();
        p.pay(500);
        p.printReceipt(500);

        PaymentMethod q = new UpiPayment();
        q.pay(600);
        q.printReceipt(600);

    }
}
