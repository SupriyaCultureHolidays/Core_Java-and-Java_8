// CoreDemo-র OrderService.java-র মতোই — dependency নিজে বানাবে না, বাইরে থেকে পাবে
// (constructor injection ও setter injection দুটোই রাখো, SpringBoot.html sec-19-এর মতো)।
package in.practice.payment;

public class CheckoutService {

    // PaymentGateway টাইপের একটা field রাখো (নাম যেমন: gateway)

    // প্যারামিটার-ওয়ালা constructor — CheckoutService(PaymentGateway gateway)
    // — এখানে field সেট করবে (this.gateway = gateway)

    // খালি (no-arg) constructor — Setter Injection-এর জন্য দরকার

    // setGateway(PaymentGateway gateway) — setter injection-এর জন্য

    // checkout(double amount)
    // — প্রথমে "Checkout started" print করবে
    // — তারপর gateway.processPayment(amount) কল করবে
    // — লক্ষ্য করো: CheckoutService জানেই না ঠিক কোন payment method ব্যবহার হচ্ছে,
    //   শুধু জানে তার কাছে একটা PaymentGateway আছে (SpringBoot.html sec-18-এর loose coupling)
}
