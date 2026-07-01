public class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    BankAccount(int accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    
    void deposit(double balance){
        if(balance>0){
            this.balance+=balance;
        }
    }
    void withdraw(double balance){
        if(this.balance>=balance){
            this.balance -=balance;
        }
    }
    void checkBalance(){
        System.out.println(this.balance);
    }

}
