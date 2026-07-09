public class BankAccount {
    int balance;

    BankAccount(int balance) {
        this.balance = balance;
    }

    void withdraw(int balance) throws InsufficientBalanceException{ // এ balance কম থাকলে InsufficientBalanceException throw করো
        if (this.balance < balance) {
            throw new InsufficientBalanceException("Sir/Mam Insufficient Balance on your Account");
        } else {
            this.balance -= balance;
            System.out.println("Withdraw Successful");

        }
    }
}
