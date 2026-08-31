// Q1 (Module 2) — কোর্সের CoreDemo-র NotificationService interface-এর ঠিক same
// role, নতুন domain-এ (SpringBoot.html sec-17)। CheckoutService যেন কোনো নির্দিষ্ট payment
// method (CreditCard/Upi/NetBanking) না জেনেই কাজ চালাতে পারে, তার জন্য এই abstraction।
package in.practice.payment;

public interface PaymentGateway {

    // void processPayment(double amount);
    // — প্রতিটা implementation নিজের মতো করে এটা override করবে (console-এ কোন
    //   ধরনের payment হলো আর কত টাকার, সেটা print করবে)
}
