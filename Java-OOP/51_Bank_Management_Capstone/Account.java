// Abstraction + Inheritance — SavingsAccount ও CurrentAccount দুইটাই একটা Account
// 49/50-তে role-ভিত্তিক Inheritance দেখেছিলে (Student/Librarian, Patient/Doctor)।
// এইবার behavior-ভিত্তিক Inheritance — দুইটাই Account, কিন্তু সুদ/ফি হিসাবের নিয়ম আলাদা।
public abstract class Account {

    // protected accountNumber (String), holderName (String), balance (double) রাখো
    // — child class-গুলো সরাসরি access করতে পারবে
    // constructor লিখো
    // getter/setter লিখো (Encapsulation) — balance-এর জন্য শুধু getter রাখাই ভালো,
    // setter না রেখে deposit()/withdraw() দিয়েই balance বদলানো উচিত
    // toString() override করো — display-এ কাজে লাগবে

    // deposit(double amount)
    // — balance বাড়াও, amount ঋণাত্মক (negative) হলে IllegalArgumentException ছুঁড়ো

    // withdraw(double amount)
    // — balance কমাও। এখানে insufficient-funds validation না করাই ভালো, সেটা
    // BankService-এ করবা, কারণ account type ভেদে rule আলাদা হতে পারে (যেমন
    // CurrentAccount-এর overdraft limit পর্যন্ত ঋণাত্মক balance-এ যাওয়ার permission আছে,
    // SavingsAccount-এর নেই)

    // abstract String getAccountType();
    // — SavingsAccount এতে "Savings" রিটার্ন করবে, CurrentAccount "Current" রিটার্ন করবে
    // — Polymorphism দেখানোর জন্য

    // abstract double applyMonthlyEffect();
    // — SavingsAccount-এ balance-এর উপর সুদ যোগ করে নতুন balance রিটার্ন করবে
    // — CurrentAccount-এ একটা maintenance fee কেটে নতুন balance রিটার্ন করবে
    // — same method call, দুই child class-এ ভিন্ন ভিন্ন logic চলবে — এটাই আসল Polymorphism

    // ── Inner Class practice (topic: Inner Class) ──
    // non-static inner class বানাও, যেমন MiniStatement — এটা Account-এর ভিতরে থাকবে বলে
    // বাইরের (outer) instance-এর private/protected field (accountNumber, balance...)
    // সরাসরি access করতে পারবে, আলাদা getter লাগবে না
    // class MiniStatement {
    //     void print() {
    //         System.out.println(accountNumber + " current balance: " + balance);
    //     }
    // }
    // ব্যবহার: Account a = new SavingsAccount(...);
    //          Account.MiniStatement stmt = a.new MiniStatement();
    //          stmt.print();

    // Bonus: Cloneable implement করো, clone() override করো (Object Cloning)
    // Bonus: Serializable implement করো (account list file-এ save/load করার জন্য)
}
