/*
 * Question 2 (Bank Account)
 * একটি BankAccount class তৈরি করো।
 * Properties: accountNumber, holderName, balance
 * Methods: deposit(), withdraw(), checkBalance()
 *
 * deposit(amount) -> balance বাড়াবে ও নতুন balance print করবে
 * withdraw(amount) -> balance কমাবে ও নতুন balance print করবে
 * checkBalance() -> বর্তমান balance print করবে
 *
 * Output (balance শুরুতে 1000):
 * Deposited 200, New Balance: 1200
 * Withdrew 500, New Balance: 700
 * Current Balance: 700
 */
public class Demo {
    public static void main(String[] args) {
        BankAccount coustomer = new BankAccount(39, "Supriya", 1000);
        coustomer.deposit(200);
        coustomer.withdraw(500);
        coustomer.checkBalance();
    }
}
