public class CurrentAccount extends Account {

    // extra field: overdraftLimit (double) — যেমন 500, মানে balance -500 পর্যন্ত যেতে পারবে
    // constructor লিখো, super(accountNumber, holderName, balance) call করো, overdraftLimit সেট করো
    String overdraftLimit;
    CurrentAccount(String accountNumber, String holderName, double balance, String overdraftLimit){
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // getAccountType() override করো — return "Current"
    @Override
    String getAccountType(){
        return "Current";
    }

    // applyMonthlyEffect() override করো
    // — একটা ছোট maintenance fee (যেমন 10) balance থেকে কেটে নতুন balance রিটার্ন করো
    double applyMonthlyEffect(){
        return balance-10;
    }

}
