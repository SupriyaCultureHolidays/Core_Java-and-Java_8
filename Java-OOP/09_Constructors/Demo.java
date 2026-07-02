/*
 * Question 9
 * BankAccount
 * balance private থাকবে।
 * Negative amount deposit করা যাবে না।
 * withdraw balance-এর বেশি হলে হবে না।
 *
 * deposit(amount): amount < 0 হলে "Invalid deposit amount" print করবে,
 * নাহলে balance বাড়াবে।
 * withdraw(amount): amount balance-এর চেয়ে বেশি হলে "Insufficient balance"
 * print করবে, নাহলে balance কমাবে।
 * Demo-তে valid ও invalid দুই রকম case টেস্ট করো।
 *
 * Output (balance=1000):
 * Invalid deposit amount   (deposit(-100) করলে)
 * Insufficient balance     (withdraw(5000) করলে)
 * Current Balance: 1000
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
