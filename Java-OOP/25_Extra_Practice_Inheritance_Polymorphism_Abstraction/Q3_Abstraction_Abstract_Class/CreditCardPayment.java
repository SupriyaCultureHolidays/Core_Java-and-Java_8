public class CreditCardPayment extends PaymentMethod{
    @Override
    void pay(double amount){
        System.out.println("Paying " + amount + " using Credit Card");
    }
}
