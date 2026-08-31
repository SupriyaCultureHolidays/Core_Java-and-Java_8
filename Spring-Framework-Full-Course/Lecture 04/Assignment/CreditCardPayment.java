// CoreDemo-র EmailService.java-র মতোই একটা concrete implementation — শুধু domain বদলেছে।
package in.practice.payment;

public class CreditCardPayment implements PaymentGateway {

    // processPayment(amount) override করো — console-এ লিখবে এটা credit card payment,
    // আর amount কত (যেমন: "Credit Card payment processed: ₹" + amount)
}
