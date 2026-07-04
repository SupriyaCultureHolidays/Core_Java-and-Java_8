/*
 * Question 19 (19_Final_Keyword) — Bank Interest Rate
 *
 * BankAccount class-এ একটা `final` variable BANK_NAME রাখো ("XYZ Bank"),
 * যেটা পরে change করা যাবে না। আরেকটা final method displayBankName()
 * লিখো, যেটা bank name print করবে (final method override করা যায় না,
 * সেটা মাথায় রেখে লিখো)।
 *
 * Output:
 * Bank Name: XYZ Bank
 */
public class Demo {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();
        bank.displayBankName();
        SbiSakha Sakha = new SbiSakha();
        Sakha.displayBankName();
        BankAccount a = new SbiSakha();
        a.displayBankName();

    }
}
