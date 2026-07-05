public abstract class PaymentMethod {

    abstract void pay(double amount);

    public void printReceipt(double amount){
        System.out.println("Receipt: Paid " + amount);
    }
}
