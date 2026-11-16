// Question 1 — Tight vs Loose Coupling (sec 1)
// প্রথমে tight-coupled ভার্সন try করে দেখো (PaymentProcessor-এর ভিতরে সরাসরি
// new CreditCardProcessor()), তারপর PaymentGateway interface দিয়ে refactor করে এই
// Demo থেকে দুইবার আলাদা PaymentGateway পাস করে দেখাও।
//
// Output:
// Paid via Credit Card
// Paid via UPI
public class Demo {
    public static void main(String[] args) {
        // 1. PaymentProcessor p1 = new PaymentProcessor(new CreditCardProcessor());
        //    p1.processPayment(100);
        // 2. PaymentProcessor p2 = new PaymentProcessor(new UpiProcessor());
        //    p2.processPayment(200);
    }
}
