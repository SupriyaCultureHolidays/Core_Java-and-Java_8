public class BankAccount {
    int bankAccount;
    private int balance;

    BankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    void getBalance() {
        System.out.println(this.balance);
    }

    void deposit(int balance) {
        if (balance > 0) {
            this.balance += balance;
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(int balance) {
        if (balance < 0) {
            System.out.println("Invalid withdraw amount");
            return;

        }
        if (this.balance >= balance) {
            this.balance -= balance;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
