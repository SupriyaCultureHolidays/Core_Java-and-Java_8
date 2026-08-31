/*
 * Module 2, Q1 — Payment Checkout DI Practice (SpringBoot.html sec-16 থেকে sec-21-এর
 * CoreDemo journey, নতুন domain-এ নিজে টাইপ করে practice করার জন্য)
 *
 * Classes: PaymentGateway, CreditCardPayment, UpiPayment, NetBankingPayment,
 *          FakePayment, CheckoutService, Main
 *
 * ── কী প্র্যাকটিস হচ্ছে ──
 *  1. Tight Coupling সমস্যা বোঝা         — CheckoutService সরাসরি new CreditCardPayment()
 *                                          লিখলে কী সমস্যা হয়, প্রথমে সেটা নিজে করে দেখা
 *                                          (তারপর মুছে নিচের ধাপে যাওয়া)
 *  2. Interface দিয়ে Abstraction         — PaymentGateway
 *  3. একাধিক Implementation              — CreditCardPayment, UpiPayment,
 *                                          NetBankingPayment, FakePayment
 *  4. Constructor + Setter Injection     — CheckoutService
 *  5. Inversion of Control (ধারণাগত)     — কন্ট্রোল এখন Main-এর হাতে, CheckoutService-এর
 *                                          হাতে না
 *
 * ── Main-এ যা করতে হবে ──
 * একটা PaymentGateway বেছে নাও (ধরো CreditCardPayment), তার object বানাও।
 * CheckoutService-এর object বানাও (খালি constructor দিয়ে), setGateway() দিয়ে
 * gateway-টা inject করো। checkout(1500) কল করো।
 * এরপর শুধু একটা লাইন বদলে (CreditCardPayment -> UpiPayment) আবার রান করো —
 * দেখাও CheckoutService-এর কোনো কোডে হাত দিতে হয়নি।
 *
 * Output (নমুনা):
 * Checkout started
 * Credit Card payment processed: ₹1500.0
 *
 * (gateway বদলানোর পর):
 * Checkout started
 * UPI payment processed: ₹1500.0
 *
 * ── Build Order ──
 *  1. PaymentGateway (interface) — সবার আগে, কোনো dependency নেই
 *  2. CreditCardPayment, UpiPayment, NetBankingPayment, FakePayment — PaymentGateway
 *     implement করে
 *  3. CheckoutService — PaymentGateway টাইপের dependency নেয়
 *  4. Main — সব একসাথে wire up করা
 *
 * ── Spring ধরার আগে যেটা মাথায় রাখবা ──
 * এখানে Main যা করছে (object বানানো, dependency জোড়া লাগানো), Spring-এ ঠিক এই কাজটাই
 * করবে IoC Container — আর CreditCardPayment/UpiPayment-এর মতো object-গুলোকেই তখন
 * বলা হবে Bean (SpringBoot.html sec-21)। আপাতত Spring নিয়ে ভাবার দরকার নেই, শুধু এই
 * ম্যানুয়াল wiring-টা নিজে হাতে করে বোঝা দরকার — Spring পরে এটাই automate করে দেবে।
 */
public class Main {
    public static void main(String[] args) {
        // (ঐচ্ছিক, আগে করে দেখো তারপর মুছে ফেলো) ১. tight coupling দিয়ে শুরু করো —
        //    CheckoutService-এর ভেতরেই সরাসরি new CreditCardPayment() লিখে রান করো,
        //    বুঝে নাও কেন এটা পরে সমস্যা করবে

        // ২. একটা CreditCardPayment (বা অন্য যেকোনো) implementation-এর object বানাও

        // ৩. CheckoutService-এর object বানাও (খালি constructor দিয়ে)

        // ৪. setGateway(...) দিয়ে dependency-টা inject করো

        // ৫. checkout(1500) কল করো, output দেখো

        // ৬. এখন শুধু ২ নম্বর ধাপের লাইনটা বদলে (CreditCardPayment -> UpiPayment বা
        //    NetBankingPayment) আবার রান করো — CheckoutService-এর কোনো কোড না ছুঁয়েই
        //    payment method বদলে গেল কিনা লক্ষ করো

        // ৭. (ঐচ্ছিক) FakePayment দিয়ে দেখাও কীভাবে টেস্টের সময় আসল payment gateway
        //    এড়িয়ে dummy একটা ব্যবহার করা যায়
    }
}
