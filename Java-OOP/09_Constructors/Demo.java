/*
 * Question 9 (09_Constructors) — BankAccount (৩ রকম Constructor)
 *
 * BankAccount class (accountNumber, holderName, balance) — ৩ রকম constructor:
 * 1. Default constructor → this(0, "Unknown", 0) দিয়ে chain করবে
 * 2. Parameterized constructor → তিনটা value নেবে
 * 3. Copy constructor → BankAccount(BankAccount other) অন্য account-এর value copy করবে
 *
 * Method: deposit(int amount), display()
 *
 * Demo.java-তে তিনটা object বানাও। Copy-টাতে deposit(4000) করো — original-এ কোনো প্রভাব পড়বে না দেখাও।
 * Bonus: constructor-এর return type থাকে না কেন? void BankAccount() লিখলে কী হয়?
 *
 * Output:
 * Account: 0, Holder: Unknown, Balance: 0
 * Account: 1245, Holder: Rahim, Balance: 1000
 * Copy -> Account: 1245, Holder: Rahim, Balance: 1000
 * After deposit in copy -> Original: 1000, Copy: 5000
 */
public class Demo {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount(1245);
        sbi.deposit(1000);
        sbi.getBalance();
        sbi.withdraw(5000);
        sbi.getBalance();
        sbi.withdraw(-100);

    }
}
