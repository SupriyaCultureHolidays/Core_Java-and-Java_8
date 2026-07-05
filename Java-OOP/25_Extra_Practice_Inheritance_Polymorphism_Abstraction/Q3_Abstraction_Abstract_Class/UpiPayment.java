public class UpiPayment extends PaymentMethod {
    @Override
    void pay(double amount){
        System.out.println("Paying " + amount + " using UPI");
    }
}
