// Payment method-এর contract — CreditCardProcessor ও UpiProcessor দুইটাই এটা implement
// করবে, যাতে PaymentProcessor কোনো concrete class না চিনেই কাজ করতে পারে (loose coupling)
public interface PaymentGateway {

    // void pay(double amount);
    System.out.println();
}
