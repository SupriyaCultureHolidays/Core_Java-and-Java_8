/*
 * Question 31 (31_Custom_Exception) — Insufficient Balance
 *
 * InsufficientBalanceException নামে custom checked exception বানাও।
 * BankAccount-এর withdraw() method-এ balance-এর চেয়ে বেশি amount
 * withdraw করার চেষ্টা করলে এই exception throw করো।
 *
 * Output:
 * Insufficient Balance!
 */
public class Demo {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(1000);
        try {
            b.withdraw(2000);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
