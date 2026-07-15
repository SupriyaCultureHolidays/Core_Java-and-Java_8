// Threads + Race Condition practice
// একই account থেকে দুইজন একসাথে শেষ টাকাটা তুলতে চাইলে কী হয় সেটা দেখো
public class ConcurrentWithdrawalDemo {

    public static void main(String[] args) {
        // BankService service = BankService.getInstance();
        // ... একটা account add করো, balance ধরো 1000 ...

        // Runnable withdrawTask = () -> {
        //     try {
        //         service.withdraw("1001", 800);
        //         System.out.println(Thread.currentThread().getName() + " withdrew successfully");
        //     } catch (Exception e) {
        //         System.out.println(Thread.currentThread().getName() + " failed: " + e.getMessage());
        //     }
        // };

        // Thread t1 = new Thread(withdrawTask, "Thread-1");
        // Thread t2 = new Thread(withdrawTask, "Thread-2");
        // t1.start();
        // t2.start();

        // প্রথমে withdraw() unsynchronized রেখে run করো — দেখো কি দুইটাই সফল হয়ে যায় কিনা
        // (race condition — দুই thread একসাথে balance check করে দুইজনেই যথেষ্ট balance দেখে ফেলে,
        // অথচ balance আসলে একবারই তোলার মতো ছিলো)
        // তারপর BankService.withdraw() method-এ "synchronized" keyword যোগ করে আবার run করো —
        // এবার একটাই সফল হবে, অন্যটা InsufficientFundsException পাবে
    }
}
