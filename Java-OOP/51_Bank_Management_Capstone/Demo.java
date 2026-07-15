/*
 * Capstone Project #3 — Bank Account Management System (49, 50-এর মতোই সব
 * OOP + Java 8 concept, নতুন domain-এ practice করার জন্য — পুরোটা নিজে লিখো)
 *
 * 49 (Library) আর 50 (Hospital)-এ role-ভিত্তিক Inheritance দেখেছো (Student/Librarian,
 * Patient/Doctor — মানুষ ভিন্ন ভিন্ন role)। এইবার behavior-ভিত্তিক Inheritance practice করো —
 * SavingsAccount আর CurrentAccount দুইটাই Account, কিন্তু সুদ/ফি হিসাব করার নিয়ম আলাদা।
 * same method call (applyMonthlyEffect()), ভিন্ন class-এ ভিন্ন logic চলে — এটাই আসল Polymorphism।
 *
 * Classes: TransactionType, Account, SavingsAccount, CurrentAccount, AccountFilter,
 *          AccountNotFoundException, InsufficientFundsException, TransactionRecord,
 *          Auditable, Loggable, Repository, BankService, ConsoleMenu,
 *          ConcurrentWithdrawalDemo, Demo
 *
 * ── Core Requirements (49, 50-এর মতোই — এবার দেখে দেখে না, নিজে থেকে লিখো) ──
 *  1. Enum                    — TransactionType { DEPOSIT, WITHDRAW, TRANSFER_IN, TRANSFER_OUT }
 *  2. Abstraction/Inheritance — Account (abstract) → SavingsAccount, CurrentAccount
 *                               (applyMonthlyEffect() override করো — সুদ বনাম ফি, Polymorphism)
 *  3. Encapsulation           — Account (accountNumber, holderName, balance) — private field + getter/setter
 *  4. Exception Handling      — AccountNotFoundException, InsufficientFundsException
 *                               (custom checked exception, withdraw/transfer-এ throw করবে)
 *  5. Functional Interface + Lambda — AccountFilter দিয়ে যেকোনো শর্তে account খোঁজা
 *                               (যেমন: service.searchAccounts(a -> a.getBalance() > 1000))
 *  6. Generics + Collection   — List<Account>, List<TransactionRecord> দিয়ে ডেটা রাখা
 *  7. Stream API              — searchAccounts() ও displayAllAccounts()-এ filter/sorted ব্যবহার করো
 *  8. Comparator              — balance অনুযায়ী account sort করো
 *  9. Optional                — findAccountByNumber() কখনো null রিটার্ন করবে না, Optional<Account> দেবে
 * 10. Record                  — TransactionRecord(accountNumber, type, amount, date) — transaction log
 * 11. Singleton               — BankService-এর মাত্র ১টা object সারা Application-এ
 *
 * ── Extra Practice (49/50-তে নতুন যা শিখেছিলে, সেটাই এখানে আবার — মুখস্থ পাকা করার জন্য) ──
 * 12. Generics (standalone) — Repository<T, ID>, আগেরবারের মতোই বানাও (save/findById/findAll/deleteById)
 *                             + bounded type (<E extends Comparable<E>>) দিয়ে max() method
 * 13. Set / Map              — BankService-এ branchCodes (Set) ও transactionsByAccount (Map)
 * 14. Interface (plain)      — Auditable — একাধিক abstract method + default method + static method
 * 15. Annotation (custom)    — Loggable — withdraw()/transfer()-এ বসাও, reflection দিয়ে পড়ে দেখাও
 * 16. Inner Class            — Account.MiniStatement (non-static inner class)
 * 17. Anonymous Inner Class  — Demo-তে AccountFilter lambda ছাড়া anonymous class দিয়েও implement করো
 * 18. User Input             — ConsoleMenu-তে Scanner দিয়ে console input নেওয়া
 * 19. Try-With-Resources     — ConsoleMenu-তে Scanner-কে try(...)-এর ভিতরে রেখে auto-close করা
 * 20. Threads + Race Condition — ConcurrentWithdrawalDemo-তে একই account থেকে দুইটা Thread
 *                               একসাথে টাকা তোলার চেষ্টা করবে
 *
 * ── Bonus (ঐচ্ছিক, চাইলে যোগ করো) ──
 * - Object Cloning — Account.clone() দিয়ে একটা account duplicate করা
 * - Serialization  — Account Serializable বানিয়ে account list file-এ save/load করা
 * - Nested Class   — BankService.Stats (static nested) দিয়ে totalAccounts/totalBalance
 * - Parallel Stream — displayAllAccounts()-এ .parallelStream() দিয়ে চেষ্টা করে দেখা
 *
 * ── Demo-তে যা করতে হবে ──
 * একটা SavingsAccount আর একটা CurrentAccount বানাও, দুইটাতেই কিছু টাকা deposit করো,
 * displayAllAccounts() (balance অনুযায়ী sorted) দিয়ে দেখাও, findAccountByNumber() দিয়ে
 * Optional test করো এবং না থাকা account-এর জন্য AccountNotFoundException handle করে দেখাও।
 * এরপর একটা account থেকে আরেকটাতে transfer() করো, এবং SavingsAccount-এর balance-এর চেয়ে
 * বেশি টাকা তুলতে গিয়ে InsufficientFundsException দেখাও। শেষে searchAccounts() দিয়ে
 * balance একটা limit-এর বেশি এমন সব account বের করো।
 *
 * Output (নমুনা):
 * Account: 1001, Holder: Rahim, Type: Savings, Balance: 5000.0
 * Account: 1002, Holder: Karim, Type: Current, Balance: 2000.0
 * Account not found: 9999
 * Transfer successful: 1001 -> 1002, amount: 1000.0
 * Insufficient funds in account 1001
 *
 * ── Build Order (নিচ থেকে উপরে — যেটা অন্যেরা use করবে সেটা আগে) ──
 *
 *  1. TransactionType (Enum) — কোনো dependency নেই, সবার আগে
 *  2. Account (abstract) → SavingsAccount, CurrentAccount — Inheritance + Polymorphism
 *  3. AccountFilter — Functional Interface (lambda দিয়ে search করার contract)
 *  4. AccountNotFoundException, InsufficientFundsException — Custom checked exceptions
 *  5. TransactionRecord — Record (plain data holder)
 *  6. Auditable, Loggable — Interface + Annotation (একসাথে practice করার জন্য পাশাপাশি রাখা)
 *  7. Repository<T, ID> — standalone Generics
 *  8. BankService — সবচেয়ে complex part: Singleton + List/Set/Map + Stream + Comparator +
 *     Optional + exception throw। এটা সবার পরে করবা কারণ এটা বাকি সব class use করে
 *  9. ConsoleMenu, ConcurrentWithdrawalDemo — BankService রেডি হওয়ার পর
 * 10. Demo — সব একসাথে test/wire up করা
 *
 * কারণ: প্রত্যেক step আগের step-এর উপর depend করে। আগে dependency না বানালে
 * পরে circular confusion হয় — ঠিক 49, 50 নাম্বার প্রজেক্টের মতোই।
 *
 * ── Spring Boot ধরার আগে যেটা মাথায় রাখবা ──
 * এই capstone শেষ করলে core Java-র প্রায় সবগুলো topic তিনবার (49, 50, 51) practice
 * হয়ে যাবে। Spring Boot ধরলে এই জিনিসগুলো চেনা লাগবে:
 * - BankService-এর Singleton pattern      -> Spring bean-এর default scope singleton
 * - Repository<T, ID>                      -> Spring Data JPA-র JpaRepository<T, ID>
 * - AccountNotFoundException handling      -> Spring-এর @ExceptionHandler/@ControllerAdvice
 * - Optional<Account>                      -> Spring Data JPA-র findById() একই জিনিস রিটার্ন করে
 * - Loggable annotation + reflection       -> Spring-এর @Transactional/@Component-এর মতো annotation-driven behavior
 * আপাতত Spring নিয়ে ভাবার দরকার নেই — শুধু concept-গুলো এখন হাতে-কলমে পাকা করে রাখলেই
 * পরে Spring শেখার সময় সব চেনা চেনা লাগবে।
 */
public class Demo {
    public static void main(String[] args) {
        // এখান থেকে শুরু করো (49, 50-এর মতোই ধাপে ধাপে):
        // 1. BankService.getInstance() দিয়ে instance নাও
        // 2. SavingsAccount ও CurrentAccount বানিয়ে addAccount() করো
        // 3. deposit() করো দুইটাতেই, তারপর displayAllAccounts() call করো
        // 4. findAccountByNumber() দিয়ে Optional test করো (থাকা আর না-থাকা দুইটাই account-এর জন্য)
        // 5. transfer() করো একটা থেকে আরেকটাতে, তারপর ইচ্ছাকৃতভাবে বেশি টাকা withdraw()
        //    করার চেষ্টা করে InsufficientFundsException try/catch দিয়ে দেখাও
        // 6. searchAccounts() দিয়ে balance ধরে filter করো (lambda দিয়ে)

        // Anonymous Inner Class practice (topic 17) — searchAccounts()-এ lambda-র বদলে
        // anonymous class দিয়েও AccountFilter implement করে পার্থক্যটা বোঝার চেষ্টা করো:
        // AccountFilter filter = new AccountFilter() {
        //     @Override
        //     public boolean matches(Account a) {
        //         return a.getBalance() > 1000;
        //     }
        // };

        // Annotation + Reflection practice (topic 15) — BankService.class-এর সব method
        // ঘুরে দেখো কোনটার উপর @Loggable বসানো আছে:
        // for (java.lang.reflect.Method m : BankService.class.getDeclaredMethods()) {
        //     if (m.isAnnotationPresent(Loggable.class)) {
        //         System.out.println(m.getName() + " -> " + m.getAnnotation(Loggable.class).action());
        //     }
        // }
    }
}
