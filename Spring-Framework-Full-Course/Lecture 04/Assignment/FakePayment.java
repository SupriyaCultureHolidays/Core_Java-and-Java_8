// CoreDemo-র FakeEmailService.java-র মতোই — আসল payment না করে টেস্টের জন্য ব্যবহার হবে,
// যাতে CheckoutService-এর লজিক টেস্ট করতে বারবার আসল payment gateway লাগাতে না হয়।
package in.practice.payment;

public class FakePayment implements PaymentGateway {

    // processPayment(amount) override করো — শুধু "Dummy payment processed" জাতীয় একটা
    // dummy message print করবে, আসল কোনো payment logic নেই
}
