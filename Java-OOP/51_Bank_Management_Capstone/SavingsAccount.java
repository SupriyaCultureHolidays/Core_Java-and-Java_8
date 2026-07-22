public class SavingsAccount extends Account {

    // extra field: interestRate (double) — যেমন 0.04 মানে 4%
    // constructor লিখো, super(accountNumber, holderName, balance) call করো, interestRate সেট করো
    double interestRate;
    SavingsAccount(String accountNumber, String holderName, double balance, double interestRate){
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    // getAccountType() override করো — return "Savings"
    @Override
    String getAccountType(){
        return "Savings";
    }

    // applyMonthlyEffect() override করো
    // — balance = balance + (balance * interestRate); নতুন balance রিটার্ন করো
    double applyMonthlyEffect(){
        return balance + (balance * this.interestRate);
    }
}
