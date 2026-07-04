public class BankAccount {
    final String BANK_NAME = "State Bank Of India";
    void displayBankName(){
        System.out.println(this.BANK_NAME);
    }
}

class SbiSakha extends BankAccount{
    // @Override;
    void displayBankName(){
        System.out.println("This is SbiSakha");
    }
}