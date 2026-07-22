// প্রথমে এটা tight-coupled ভাবে লিখো (ভিতরে সরাসরি new CreditCardProcessor() করে
// pay() call করো), চালিয়ে দেখো। তারপর refactor করো — constructor-এ PaymentGateway
// নেবে, processPayment() delegate করবে gateway.pay()-কে। এখন PaymentProcessor-এর
// ভিতরের কোড আর না বদলেই CreditCardProcessor বা UpiProcessor — যেকোনোটা চালানো যাবে
// (topic 1 — এটাই Strategy Design Pattern)
public class PaymentProcessor {

    private PaymentGateway gateway;

    // constructor(PaymentGateway gateway)

    // processPayment(double amount) — gateway.pay(amount) call করো
}
